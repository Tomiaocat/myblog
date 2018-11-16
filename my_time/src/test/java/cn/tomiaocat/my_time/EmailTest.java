package cn.tomiaocat.my_time;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest

public class EmailTest {
    
  /*  @Autowired
    private JavaMailSender mailSender; //自动注入的Bean
    
    @Value("${spring.mail.username}")
    private String Sender; //读取配置文件中的参数
    
    @Test*/
   /* public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(Sender); //自己给自己发送邮件
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }*/
    
    public static void main(String[] args) {
        System.out.printf("%tc",new Date());
        System.out.println();
        System.out.printf("%tF",new Date());
        /*System.out.printf("%tD",new Date());
        System.out.printf("%tT",new Date());
        System.out.printf("%tr",new Date());
        System.out.printf("%tY",new Date());*/
    }
}