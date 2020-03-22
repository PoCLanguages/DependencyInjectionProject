package com.gft.depencyinjectionproject.demo.controller;

import com.gft.depencyinjectionproject.demo.mail.MailSender;
import com.gft.depencyinjectionproject.demo.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;


@RestController
public class MailController {

    private MailSender mailSender;

//    @Autowired
//    public MailController(@Qualifier("smtpMailSender") MailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//    OR
//    @Autowired
//    public MailController(MailSender smtpMailSender) {
//        this.mailSender = smtpMailSender;
//    }

    @Autowired
    public MailController(MailSender mockMailSender) {
        this.mailSender = mockMailSender;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {
        mailSender.send("tankintat@gmail.com", "A test mail", "Body of the test mail");

        return "Mail sent";
    }

}
