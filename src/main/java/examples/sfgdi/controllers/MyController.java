package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }

    public String helloWorld() {
        System.out.println("Hello World!");
        return "Printed successfully!";
    }
}
