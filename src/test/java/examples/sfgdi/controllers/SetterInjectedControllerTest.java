package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setService(new GreetingServiceImpl());
    }

    @Test
    void greet() {
        System.out.println(controller.greet());
    }
}