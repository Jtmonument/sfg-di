package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService service;

    public I18nController(@Qualifier("I18n") GreetingService service) {
        this.service = service;
    }

    public String greet() {
        return service.getGreeting();
    }
}
