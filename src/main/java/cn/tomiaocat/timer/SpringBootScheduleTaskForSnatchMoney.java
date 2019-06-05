package cn.tomiaocat.timer;

import cn.tomiaocat.pojo.SendEmail;
import cn.tomiaocat.pojo.TimerUrl;
import cn.tomiaocat.pojo.repository.TimerUrlRepository;
import cn.tomiaocat.pojo.repository.sendEmailRepository;
import cn.tomiaocat.util.dao.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * TODO 每天十点 在10点整 +-20秒内  去抢红包
 * @author : double
 * @date :2018/8/20 20:11
 */
@Component
public class SpringBootScheduleTaskForSnatchMoney {
    @Autowired
    private TimerUrlRepository timerUrlRepository;
    @Autowired
    private sendEmailRepository SRepository;
    Logger logger = LoggerFactory.getLogger(SpringBootScheduleTaskForSnatchMoney.class);
    private static Integer ONE = 1;
    
    //    @Scheduled(cron = "0/1 * * * * ?")
//    @Scheduled(cron = "0 27 15 * * ?")
    public void printSay() throws MessagingException {
        logger.info("抢红包~~~~~~~~~定时器开始执行~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        logger.info("抢红包~~~~~~~~~定时器开始执行~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        logger.info("抢红包~~~~~~~~~定时器开始执行~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<TimerUrl> list = timerUrlRepository.findAll();
        logger.info("定时器查询到需要 签到的账号有"+list.size()+"条~~~");
        for (TimerUrl timerUrl : list) {
            logger.info("定时器当前执行的用户是===========>"+timerUrl.toString());
            String email = timerUrl.getEmail();
            String url = timerUrl.getUrl().replace("wapUser/signIn","wapActivity/snatchMoney");
            //替换抢钱的url https://app.eq28.cn/wapUser/signIn?token=b6bce4a1-5b2d-4344-b404-49d2350d8535
            // /wapActivity/snatchMoney
            
            SendEmail sendEmail = new SendEmail();
            try {
                //在这里写你要执行的内容
                int v = (int) (1 + Math.random() * (10)*1000);//在十秒内 抢红包
                //随机睡眠一段时间
                Thread.sleep(v);
                
                String s = httpsRequest(url, "GET", null);
                logger.info(s);
                timerUrl.setResult(s + new Date());
    
    
                
                sendEmail.setContent(s);
                sendEmail.setEmail(email);
                sendEmail.setCreateTime(new Date());
                SRepository.save(sendEmail);
                timerUrlRepository.save(timerUrl);
                emailService.sendSimpleMail(email, "TIMER", s);
                sendEmail.setStatus(ONE);
                SRepository.save(sendEmail);
                logger.info(timerUrl.getName()+"抢红包======>执行结束");
            } catch (Exception e) {
                logger.error("发送失败"+timerUrl.getEmail()+timerUrl.getName());
                System.out.println("-------------解析信息发生异常--------------" + e);
                sendEmail.setStatus(-1);
                sendEmail.setContent(e.getMessage());
                SRepository.save(sendEmail);
                emailService.sendSimpleMail(email, "TIMER IS UNSUCCESS!!!!!!!!!!!!!", "test is IS UNSUCCESS!!!!!!!!!!!!!");
            }
        }
    }
    
    @Resource
    private EmailService emailService;
    
    /*
     * 处理https GET/POST请求
     * 请求地址、请求方法、参数
     * */
    public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            //创建SSLContext
            SSLContext sslContext = SSLContext.getInstance("SSL");
            TrustManager[] tm = {new MyX509TrustManager()};
            //初始化
            sslContext.init(null, tm, new java.security.SecureRandom());
            ;
            //获取SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(requestMethod);
            //设置当前实例使用的SSLSoctetFactory
            conn.setSSLSocketFactory(ssf);
            conn.connect();
            //往服务器端写内容
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
            }
            
            //读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
    
    
    
}
