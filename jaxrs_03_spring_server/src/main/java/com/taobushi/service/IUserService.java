package com.taobushi.service;

import com.taobushi.entity.User;

import javax.ws.rs.*;
import java.util.List;

@Path("userService")
@Produces("*/*")
public interface IUserService {
    @POST
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET
    @Path("/user/{id}")
    @Produces({"application/xml","application/json"})
    public List<User> finAllUsers();

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);

}
