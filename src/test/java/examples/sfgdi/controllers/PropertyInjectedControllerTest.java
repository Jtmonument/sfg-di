package examples.sfgdi.controllers;

import examples.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.service = new GreetingServiceImpl();
    }

    @Test
    void greet() {
        System.out.println(controller.greet());
    }
}