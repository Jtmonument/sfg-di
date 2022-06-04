package examples.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18n")
public class EnglishService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Good morning!";
    }
}
