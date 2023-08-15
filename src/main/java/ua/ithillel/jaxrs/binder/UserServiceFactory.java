package ua.ithillel.jaxrs.binder;

import org.glassfish.hk2.api.Factory;
import ua.ithillel.jaxrs.service.UserService;
import ua.ithillel.jaxrs.service.UserServiceDefault;

public class UserServiceFactory implements Factory<UserService> {
    @Override
    public UserService provide() {
        return new UserServiceDefault();
    }

    @Override
    public void dispose(UserService userService) {
        // close resources if available
    }
}
