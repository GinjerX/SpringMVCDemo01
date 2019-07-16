package com.ps.controller;

import com.ps.service.LoginService;
import com.ps.service.MailService;
import com.ps.vo.MessageVO;
import com.ps.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private MailService mailService;

    @RequestMapping("/login")
    public MessageVO login(@RequestParam String username, @RequestParam String password, HttpSession session){
        MessageVO<Object> messageVO = new MessageVO<>();

        User login = loginService.login(username, password);
        String emailcode = session.getAttribute("code_email").toString();

        if(emailcode!=null){
            if(login!=null){
                messageVO.setMsg("登录成功");
            }else{
                messageVO.setMsg("登录失败");
            }
        }
        return messageVO;
    }

}
