package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService service;

    public void setService(GreetingService service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }

}
