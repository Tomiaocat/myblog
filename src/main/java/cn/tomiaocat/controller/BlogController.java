package cn.tomiaocat.controller;

import cn.tomiaocat.common.BaseConstants;
import cn.tomiaocat.pojo.repository.TimerUrlRepository;
import cn.tomiaocat.pojo.repository.UserRepository;
import cn.tomiaocat.util.SendEmailUtil;
import cn.tomiaocat.util.dao.EmailService;
import cn.tomiaocat.util.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;


/**
 * @param --
 * @author double
 * @date 2018/3/10 12:57
 * @return 开始搭建自己的博客首页-------------biubiubiu~~
 */
@Controller
@RequestMapping(value = "/")
public class BlogController {
    
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TimerUrlRepository timerUrlRepository;
    @Resource
    private EmailService emailService;
    //日志记录器
    Logger logger = LoggerFactory.getLogger(BlogController.class);
    
    @Value("${spring.mail.username}")
    private String username;
    
    @RequestMapping(value = "/")
    public String index(ModelMap map) throws Exception {
         Date notSmokeTimer =  DateUtil.StringToDate("2018-11-16 12:36:36");
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
        Date date = new Date();
    
        long i = DateUtil.getIntervalSec(notSmokeTimer,date);
        String s = i + "";
        s = s.substring(s.length()-1);
        System.out.println(s);
        
        int k = Integer.parseInt(s);
        map.addAttribute("second",i);
        map.addAttribute("S_name", BaseConstants.S_NAME_ARR[k]);
        return "my_blog/index";
    }
    
    @RequestMapping(value = "/single")
    public String single() throws Exception {
        
        return "my_blog/single";
    }
    
    
    @RequestMapping(value = "/about")
    public String about() {
        return "my_blog/about";
    }
    
    @RequestMapping(value = "/grid")
    public String grid() {
        return "my_blog/grid";
    }
    
    @RequestMapping(value = "/services")
    public String services() {
        return "my_blog/services";
    }
    
    @RequestMapping(value = "/gallery")
    public String gallery() {
        return "my_blog/gallery";
    }
    
    @RequestMapping(value = "/contact")
    public String contact() {
        return "my_blog/contact";
    }
    
    /**
     * 测试邮件发送
     */
    @RequestMapping(value = "/getTestDemoEmail", method = RequestMethod.GET)
    public @ResponseBody
    String getEntityById() throws Exception {
        String sendTo = "782454854@qq.com";
        String titel = "SING-LOG";
        String content = "亲爱的,签到已完成";
        emailService.sendSimpleMail(sendTo, titel, content);
        return "fasong";
    }
}
