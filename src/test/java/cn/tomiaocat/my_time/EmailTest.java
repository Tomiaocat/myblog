package cn.tomiaocat.my_time;

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