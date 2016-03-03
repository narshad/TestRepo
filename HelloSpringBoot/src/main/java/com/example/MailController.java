package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * Created by narshad on 02/03/16.
 */
@RestController
public class MailController {

    @Autowired
    private SmtpMailSender smtpMailSender;

    @RequestMapping("/mail")
    public String sendMail() throws MessagingException {
        smtpMailSender.send("niallarshad001@gamil.com","Some Subject","The content");
        return "Mail send";
    }
}
