package org.edu.academic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcademicApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(AcademicApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
