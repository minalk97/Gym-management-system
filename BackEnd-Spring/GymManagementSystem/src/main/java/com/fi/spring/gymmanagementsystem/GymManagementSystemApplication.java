package com.fi.spring.gymmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
		"com.fi.spring.gymmanagementsystem.controller",
        "com.fi.spring.gymmanagementsystem.service"
})
public class GymManagementSystemApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(GymManagementSystemApplication.class, args);
	}

}
