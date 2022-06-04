package examples.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Primary Service says hello!";
    }
}
