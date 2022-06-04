package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {

    private final GreetingService service;

    public ConstructorInjectedController(@Qualifier("constructorService") GreetingService service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }
}
