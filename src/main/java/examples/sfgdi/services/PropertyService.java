package examples.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Property Service says hello!";
    }
}
