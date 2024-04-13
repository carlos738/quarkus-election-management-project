package infrastrucuture.lifecycle;

import domain.Election;
import infrastructure.repositories.RedisElectionRepository;
import io.quarkus.redis.datasource.ReactiveRedisDataSource;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.infrastructure.Infrastructure;

import java.util.logging.Logger;

public class Subscribe {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Subscribe.class));
    public Subscribe(ReactiveRedisDataSource reactiveRedisDataSource,
                     RedisElectionRepository repository){
        LOGGER.info("Startup: Subscribe");

        Multi<String>sub = reactiveRedisDataSource.pubsub(String.class)
                .subscribe("elections");

        sub.emitOn(Infrastructure.getDefaultWorkerPool())
                .subscribe()
                .with(id ->{
                    LOGGER.info("Election"+ id +"received from subscription");

                    Election election = repository.findById(id);
                    LOGGER.info("Election" + election.id()+"starting");
                });

    }
}
