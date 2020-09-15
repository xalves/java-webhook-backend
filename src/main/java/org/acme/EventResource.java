package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import org.acme.rest.json.event.Event;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EventResource {

    private static final Logger LOG = Logger.getLogger(EventResource.class);


    public Response hello() {
        String result = "Hello!";
        LOG.info("Returning " + result);
        LOG.trace("Returning " + result); //doesn't appear in the logs
        LOG.debug("Returning " + result); //doesn't appear in the logs
        LOG.warn("Returning " + result);
        LOG.error("Returning " + result);
        return Response.ok(result,MediaType.APPLICATION_JSON).build();

    }

    private Set<Event> events = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public EventResource() {
        events.add(new Event("Apple", "Winter fruit"));
        events.add(new Event("Pineapple", "Tropical fruit"));
    }

    @GET
    public Response list() {
        return Response.ok(events).build();
    }

    @POST
    public Response add(Event fruit) {
        events.add(fruit);
        return Response.ok(events).build();
    }

    @DELETE
    public Response delete(Event fruit) {
        events.removeIf(existingFruit -> existingFruit.json.contentEquals(fruit.json));
        return Response.ok(events).build();
    }
}