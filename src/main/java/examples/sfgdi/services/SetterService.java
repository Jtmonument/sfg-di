package examples.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Setter Service says hello!";
    }
}
