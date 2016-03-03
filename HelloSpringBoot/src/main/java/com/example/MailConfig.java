package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * Created by narshad on 02/03/16.
 */
@Configuration
public class MailConfig {

    @Autowired
    private JavaMailSender javaMailSender;

    @Bean
    @ConditionalOnProperty(name= "spring.mail.host",
                                havingValue = "foo",
                                matchIfMissing = true)
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    @Bean
    @ConditionalOnProperty(name = "spring.mail.host")
    public MailSender smtpMailSender() {
        SmtpMailSender mailSender = new SmtpMailSender();
        mailSender.setJavaMailSender(javaMailSender);
        return new MockMailSender();
    }

}
