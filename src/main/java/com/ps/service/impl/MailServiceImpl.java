package com.ps.service.impl;

import com.ps.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Service
public class MailServiceImpl  implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    /**
     * @param to 接收者
     */
    @Override
    public String sendMail(String to) {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("1115820867@qq.com");//发起者

        String emailcode= verifyCode();


        mailMessage.setTo(to);//接受者
        //如果发给多个人的：
        //mailMessage.setTo("1xx.com","2xx.com","3xx.com");  
        mailMessage.setSubject("email登录验证码");//主题
        mailMessage.setText("验证码为："+emailcode);//内容
        try {
            mailSender.send(mailMessage);
            System.out.println("发送简单邮件");
            return emailcode;
        }catch (Exception e){
            // System.out.println("e: "+e);
            e.printStackTrace();
            System.out.println("发送简单邮件失败");
        }
        return null;
    }

    public String verifyCode() {
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 6; i++){
            int key = random.nextInt(3);
            switch (key){
                case 0:
                    int code1 = random.nextInt(10);
                    str += code1;
                    break;
                case 1:
                    char code2 = (char)(random.nextInt(26)+65);
                    str += code2;
                    break;
                case 2:
                    char code3 = (char)(random.nextInt(26)+97);
                    str += code3;
                    break;
            }
        }
        return str;
    }
}
