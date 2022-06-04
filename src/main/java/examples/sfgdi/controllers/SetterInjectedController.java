package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService service;

    @Autowired
    public void setService(@Qualifier("setterService") GreetingService service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }

}
