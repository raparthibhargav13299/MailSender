package com.example.Spring.mail.sender;

import com.example.Spring.mail.sender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringMailSenderApplication {
	@Autowired
	private EmailService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringMailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendEmail("raparthibhargav13299@gmail.com","This is first Mail from SpringBoot","This is the Email Subject");
	}

}
