package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService service;

    public String greet() {
        return service.getGreeting();
    }
}
