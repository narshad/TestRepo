package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by narshad on 02/03/16.
 */


public class MockMailSender implements MailSender{
    private static final Log log = LogFactory.getLog(MockMailSender.class);
    @Override
    public void send (String to, String subject, String body){
        log.info("Sending mail to " + to);
        log.info("Subject " + subject);
        log.info("Body " + body);
    }
}
