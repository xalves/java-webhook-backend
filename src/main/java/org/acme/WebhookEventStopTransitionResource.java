package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.rest.json.webhookeventstoptransition.Transition;
import org.acme.rest.json.webhookeventstoptransition.WebhookEventStopTransition;
import org.jboss.logging.Logger;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
@Path("/webhookTransition")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WebhookEventStopTransitionResource {

    @Inject
    EntityManager em;

    private static final Logger LOG = Logger.getLogger(WebhookEventStopTransitionResource.class);

    private Set<WebhookEventStopTransition> webhookTransitionEvents = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    @GET
    public Response list() {
        return Response.ok(webhookTransitionEvents).build();
    }

    @Transactional
    @POST
    public Response add(WebhookEventStopTransition event) {
        //LOG.info(event.toString());
        em.persist(event);
        return Response.ok(event).build();
    }

}