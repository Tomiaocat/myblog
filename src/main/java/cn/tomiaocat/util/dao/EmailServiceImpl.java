package cn.tomiaocat.util.dao;

/**
 * @author : double
 * @date :2018/8/20 21:05
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {
    
    
    @Autowired
    private JavaMailSender mailSender;
     @Value("${spring.mail.username}")
     private String from;
    
    public void sendSimpleMail(String sendTo, String titel, String content) throws MessagingException {
//        SimpleMailMessage message = new SimpleMailMessage();
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom( from);
        helper.setTo(sendTo);
        helper.setSubject(titel);
        helper.setText(content);
        mailSender.send(message);
    }
    
    
}