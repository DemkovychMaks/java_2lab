package ua.lviv.iot.lightShop;

import ua.lviv.iot.lightShop.models.Good;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Path("good")
public class GoodController {
    static final AtomicInteger id = new AtomicInteger(1);
    static final Map<Integer, Good> goods =
            new HashMap<>(Collections.singletonMap(id.get(), new Good(id.get(), "Bulb")));

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGood(@PathParam("id") int id) {
        if (goods.containsKey(id)) {
            return Response.ok(goods.get(id).toJson()).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAGoods() {
        return Response.status(Response.Status.OK).entity(goods).build();
    }

    @HEAD
    @Path("{id}")
    public Response getGoodStatus(@PathParam("id") int id) {
        if (goods.containsKey(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createGood(@FormParam("name") String name) {
        Good good = new Good(id.incrementAndGet(), name);
        goods.put(good.getId(), good);
        URI uri = UriBuilder.fromUri(Main.BASE_URI).path("goods").path("" + good.getId()).build();
        return Response.created(uri).build();
    }
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateOrCreateGood(@PathParam("id") int id, @FormParam("name") String name) {
        Good good = new Good(id, name);
        goods.put(good.getId(), good);
        return Response.ok().entity(good.toJson()).build();
    }

    @DELETE
    @Path("{id}")
    @Produces
    public Response deleteGood(@PathParam("id") int id) {
        if (goods.containsKey(id)) {
            Good good = goods.remove(id);
            return Response.ok().entity(good.toJson()).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
