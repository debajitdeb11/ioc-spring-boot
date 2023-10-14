package xyz.debajit.inversionOfControl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import person.Hero;

@RestController
public class HeroController {
    private Hero hero;

    @GetMapping("/hero/name")
    public String name() {
        return this.hero.name();
    }

    @GetMapping("/hero/power")
    public String power() {
        return this.hero.superPower();
    }

    /* Setter based Dependency Injection */
    @Autowired
    public void setHero(Hero hero) {
        this.hero = hero;
    }

}
