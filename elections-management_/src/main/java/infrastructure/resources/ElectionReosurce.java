package infrastructure.resources;

import api.ElectionApi;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/elections")

public class ElectionReosurce {
    private final ElectionApi api;
    /*private final ElectionApi api;*/

    public ElectionReosurce(ElectionApi api) {
        this.api = api;
    }

    @POST
    @ResponseStatus(RestResponse.StatusCode.CREATED)
    @Transactional
    public void submit(){
        api.submit();
    }

    @GET
    public List<Object> list(){
        return api.findAll();

    }
}
