package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyService")
    @Autowired
    public GreetingService service;

    public String greet() {
        return service.getGreeting();
    }
}
