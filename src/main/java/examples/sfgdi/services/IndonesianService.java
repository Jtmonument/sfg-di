package examples.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IN")
@Service("I18n")
public class IndonesianService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Selamat pagi!";
    }
}
