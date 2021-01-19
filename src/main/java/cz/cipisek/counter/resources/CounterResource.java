package cz.cipisek.counter.resources;

import cz.cipisek.counter.managers.CounterManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




@Path("counter")
@Produces(MediaType.APPLICATION_JSON)
public class CounterResource {

    @Inject
    private  CounterManager counterManager;



    @GET
    public Response getCounter() {
        return Response.ok(counterManager.getCounter()).build();
    }

    @POST
    public void increment() {
        counterManager.increment();
    }

    @DELETE
    public void decrement() {
        counterManager.decrement();
    }
}
