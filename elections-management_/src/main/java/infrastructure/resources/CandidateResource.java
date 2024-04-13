package infrastructure.resources;

import api.CandidateApi;

import api.dto.in.CreateCandidate;
import api.dto.in.UpdateCandidate;
import domain.Candidate;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.*;
@Produces(APPLICATION_JSON)

@Consumes(APPLICATION_JSON)
@Path("/api/candidates")
public class CandidateResource {
    private final CandidateApi api;

    public CandidateResource(CandidateApi api) {
        this.api = api;
    }

    @POST
    @ResponseStatus(RestResponse.StatusCode.CREATED)
    @Transactional
    public void create(CreateCandidate dto){
        api.create(dto);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public api.dto.out.Candidate update(@PathParam("id") String id, UpdateCandidate dto){
        return api.update(id, dto);
    }

    @GET
    public List<Candidate> list(){
        return api.list();
    }
}
