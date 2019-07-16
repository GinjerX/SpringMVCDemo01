package com.ps.controller;

import com.ps.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyEmail {

    @Autowired
    private MailService mailService;

    @RequestMapping("/sendMail")
    public  void sendSimpleMail(@RequestParam String myEmail, HttpSession session) throws Exception{
        String mail = mailService.sendMail(myEmail);
        session.setAttribute("code_email",mail);
        System.out.println(session.getId());
    }
}
