package util.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    @Override
    public String name() {
        return "This is the Cricket Coach";
    }

    @Override
    public String getWorkOutPlan() {
        return "Run every dam mile!!!";
    }
}
