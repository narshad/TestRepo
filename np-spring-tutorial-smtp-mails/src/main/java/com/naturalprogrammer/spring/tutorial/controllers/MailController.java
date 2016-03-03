package com.naturalprogrammer.spring.tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.tutorial.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;
	
	@Autowired
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String sendMail() throws MessagingException {
		
		mailSender.send("niallarshad001@gmail.com", "Some subject", "the content");
		
		return "Mail sent";
	}
}
