package util.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String name() {
        return "I'm Debajit, The football Coach";
    }

    @Override
    public String getWorkOutPlan() {
        return "Try to workout regularly everyday";
    }
}
