package examples.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FR", "default"})
@Service("I18n")
public class FrenchService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Bon matin!";
    }
}
