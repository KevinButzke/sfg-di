package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingService  implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello from the primary world";
    }
}
