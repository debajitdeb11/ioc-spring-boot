package person;

import org.springframework.stereotype.Component;

@Component
public class IronMan implements Hero{
    @Override
    public String name() {
        return "This is Iron Man";
    }

    @Override
    public String superPower() {
        return "My heart is that of Iron";
    }
}
