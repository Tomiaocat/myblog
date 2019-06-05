package cn.tomiaocat.util;

import cn.tomiaocat.common.SpringUtil;
import cn.tomiaocat.pojo.SendEmail;
import cn.tomiaocat.pojo.User;
import cn.tomiaocat.pojo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Random;

/**
 * @author : double
 * @date :2018/3/16 12:11
 */
public class SendEmailUtil {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private SimpleMailMessage simpleMailMessage;
    @Value("${spring.mail.username}")
    private static String from;
    
    private static int MAX = 999999;
    private static int MIN = 100000;
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(from); //自己给自己发送邮件
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        javaMailSender.send(message);
    }
    
    
    /**
     *
     * @author double
     * @date 2018/3/16 12:32
     * @param -[username, to]-
     * @return boolean
     * 用户邮箱登录-- 发送初始化登录密码
     */
    public boolean sendLoginCode(String username,String to) {
        String  code = getCode();
        SendEmail message = new SendEmail();
        message.setFrom(username);
        message.setSentDate(new Date());
        message.setSubject("loginCode");
        message.setTo(to);
        message.setText("loginCode : " +
                code);
        UserRepository userRepository = SpringUtil.getBean("userRepository");
        User user = new User();
        user.setName(username);
        user.setEmail(username);
        user.setPassword(code);
        userRepository.save(user);
       javaMailSender.send(message);
        return true;
    }
    /**
     *
     * @author double
     * @date 2018/8/20 20:25
     * @param -[]-
     * @return void
     *
     * 定时器请求url  返回结果--发送到设定的邮箱
     */
    public void sendTimer(String email){
        SendEmail message = new SendEmail();
        message.setFrom("");
        message.setSentDate(new Date());
        message.setSubject("loginCode");
        message.setTo(email);
        message.setText("loginCode : " +
                "");
        javaMailSender.send(message);
        
    
    
    }    public String getCode(){
        Random rand = new Random();
        Integer randNumber = rand.nextInt(MAX - MIN+ 1) + MIN;
        return randNumber.toString();
    }
    /**
     * @方法名: sendMail
     * @参数名：@param subject  邮件主题
     * @参数名：@param content 邮件主题内容
     * @参数名：@param from        发件人Email地址
     * @参数名：@param to         收件人Email地址
     * @描述语: 发送邮件
     */
    public  void sendMail(String subject, String content, String from,String to) {
        
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            /**
             * new MimeMessageHelper(mimeMessage,true)之true个人见解：
             * 关于true参数,官方文档是这样解释的：
             * use the true flag to indicate you need a multipart message
             * 翻译过来就是：使用true,以表明你需要多个消息
             * 再去翻一下MimeMessageHelper的API,找到这样一句话：
             * supporting alternative texts, inline elements and attachments
             * 也就是说,如果要支持内联元素(HTML)和附件就必须给定第二个参数为true
             * 否则抛出 java.lang.IllegalStateException 异常
             */
            /**
             * 刚开始收到邮件显示中文乱码,于是赶紧查看官方文档,没有提到,再查阅API,也没有查到Set编码的方法,
             * 于是就在HTML里面自己指定编码,也不起作用,邮件还是显示中文乱码;
             * 最后的结论是：如果HTML内容含有中文必须指定HTML的编码,默认是ISO-8859-1,所以会显示中文乱码
             * 在MimeMessageHelper的构造方法中找到：
             * MimeMessageHelper(MimeMessage mimeMessage, boolean multipart, String encoding)
             * 实验一下,OK,原来编码是在这儿设置,没事了,中文正常显示
             */
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
            messageHelper.setFrom(from); //设置发件人Email
            messageHelper.setSubject(subject); //设置邮件主题
            messageHelper.setText(content);   //设置邮件主题内容
            messageHelper.setTo(to);          //设定收件人Email

//            messageHelper.setText(
//                    "<html>" +
//                            "<body>" + content +
//                            "</body>" +
//                            "</html>", true);
            //步骤 1
            //资源的引用方法：cid:你自己设置的资源ID
//            messageHelper.setText(
//                    "<html>" +
//                            "<body>" +
//                            "<BR>" +
//                            "<div align='center'>" +
//                            "<img src='cid:imageid'/>" +
//                            "<BR>" +
//                            "<h4>" +
//                            "返回 fancydeepin 的Blogjava：" +
//                            "<a href='http://www.blogjava.net/fancydeepin/'>http://www.blogjava.net/fancydeepin/</a>" +
//                            "</h4>" +
//                            "</div>" +
//                            "</body>" +
//                            "</html>", true);
            /**
             * ClassPathResource：很明显就是类路径资源,我这里的附件是在项目里的,所以需要用ClassPathResource
             * 如果是系统文件资源就不能用ClassPathResource,而要用FileSystemResource,例：
             * FileSystemResource file = new FileSystemResource(new File("D:/woniu.png"));
             */
            /**
             * 如果想在HTML中使用资源,必须在HTML中通过资源 ID 先引用资源,然后才来加载资源
             */
            //步骤 2
//            ClassPathResource image = new ClassPathResource("images/body.png");
//            messageHelper.addInline("imageid", image);
            javaMailSender.send(mimeMessage);    //发送HTML邮件
            
        } catch (Exception e) {
            System.out.println("异常信息：" + e);
        }
    }
 
    
}
