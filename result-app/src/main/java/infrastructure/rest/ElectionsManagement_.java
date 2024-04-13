package infrastructure.rest;

import domain.Election;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@RegisterRestClient(configKey = "election-management_")
public interface ElectionManagement_ {
    @GET
    @Path("/api/elections")
    Uni<List<Election>> getElections();
}