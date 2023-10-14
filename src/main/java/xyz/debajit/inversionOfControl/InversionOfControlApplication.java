package xyz.debajit.inversionOfControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"xyz.debajit.inversionOfControl", "util.common", "person"})
public class InversionOfControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(InversionOfControlApplication.class, args);
	}

}
