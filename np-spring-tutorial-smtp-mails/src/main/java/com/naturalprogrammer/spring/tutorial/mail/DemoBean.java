package com.naturalprogrammer.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by narshad on 03/03/16.
 */
public class DemoBean {
    private static final Log log = LogFactory.getLog(MockMailSender.class);

    public DemoBean() {
        log.info("DemoBean created!");
    }

    public String foo(){
        return "something";
    }
}
