package xyz.debajit.inversionOfControl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.common.Coach;

@RestController
public class DemoController {

    private final Coach coach;

    /* Constructor based dependency injection */
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/coach/name")
    public String coachName() {
        return coach.name();
    }

    @GetMapping("/coach/plan")
    public String plan() {
        return coach.getWorkOutPlan();
    }
}
