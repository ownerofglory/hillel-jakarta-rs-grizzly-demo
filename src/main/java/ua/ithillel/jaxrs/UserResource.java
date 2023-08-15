package ua.ithillel.jaxrs;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import ua.ithillel.jaxrs.model.User;
import ua.ithillel.jaxrs.service.UserService;

import java.util.List;

@Path("users")
public class UserResource {
    @Inject
    private UserService userService;

    // CRUD - create, read, update, delete

    // /users
    @GET
    @Produces(value = "application/json")
    public List<User> getAll() {
        return userService.getUsers();
    }

    // /users/12
    @GET
    @Path("/{id}")
    @Produces(value = "application/json")
    public User getById(@PathParam("id") Integer id) {
        return userService.getUserById(id);
    }

    // /users
    @POST
    @Consumes(value = "application/json")
    public void add(User user) {
        userService.addUser(user);
    }

    // /users/12
    @PUT
    @Path("/{id}")
    @Produces(value = "application/json")
    @Consumes(value = "application/json")
    public User add(@PathParam("id") Integer id, User newUser) {
        return userService.updateUser(id, newUser);
    }

    @DELETE
    @Path("/{id}")
    public User delete(@PathParam("id") Integer id) {
        return userService.deleteUser(id);
    }
}
