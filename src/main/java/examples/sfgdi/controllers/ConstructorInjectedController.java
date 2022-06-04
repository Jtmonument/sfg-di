package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    private final GreetingServiceImpl service;

    public ConstructorInjectedController(GreetingServiceImpl service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }
}
