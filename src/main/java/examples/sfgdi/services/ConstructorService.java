package examples.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Constructor Service says hello!";
    }
}
