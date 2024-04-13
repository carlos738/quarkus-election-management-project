package infrastructure.resource;

import domain.Election;
import io.smallrye.mutiny.Multi;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestStreamElementType;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Path("/")
public class ResultResource {
    private final ElectionManagement_ electionManagement_;

    public ResultResource(@RestClient ElectionManagement_ electionManagement_) {
        this.electionManagement_ = electionManagement_;
    }

    @GET
    @RestStreamElementType(MediaType.APPLICATION_JSON)
    public Multi<List<Election>> results(){
        return Multi.createFrom()
                .ticks()
                .every(Duration.of(5, ChronoUnit.SECONDS))
                .onItem()
                .transformToMultiAndMerge(n -> electionManagement_.getElections.toMulti());
    }
}