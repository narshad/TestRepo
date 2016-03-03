package com.example;

import org.springframework.stereotype.Repository;

import javax.mail.MessagingException;

/**
 * Created by narshad on 02/03/16.
 */
@Repository
public interface MailSender {
    void send(String to, String subject, String body) throws MessagingException;
}
