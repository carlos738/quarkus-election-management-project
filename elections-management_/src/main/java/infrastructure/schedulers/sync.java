package infrastructure.schedulers;

import domain.anotations.Principal;
import infrastructure.repositories.RedisElectionRepository;
import infrastructure.repositories.SQLElectionRepository;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class sync {
    private final SQLElectionRepository sqlRepository;
    private final RedisElectionRepository redisRepository;

    public sync(@Principal SQLElectionRepository sqlRepository, RedisElectionRepository redisRepository) {
        this.sqlRepository = sqlRepository;
        this.redisRepository = redisRepository;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    void sync() {
        sqlRepository.findAll()
                .forEach(election -> sqlRepository
                        .sync(redisRepository.sync(election)));
    }
}