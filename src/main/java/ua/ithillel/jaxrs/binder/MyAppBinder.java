package ua.ithillel.jaxrs.binder;

import jakarta.inject.Singleton;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import ua.ithillel.jaxrs.service.UserService;

public class MyAppBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bindFactory(new UserServiceFactory())
                .to(UserService.class)
                .in(Singleton.class);
    }

}
