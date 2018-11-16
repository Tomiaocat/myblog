/*
package cn.tomiaocat.timer;

import cn.tomiaocat.pojo.repository.TimerUrlRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.TimerTask;

*/
/**
 * @author : double
 * @date :2018/8/11 15:55
 *//*

public class NFDFlightDataTimerTask extends TimerTask {
    
    
    private static Logger log = Logger.getLogger(NFDFlightDataTimerTask.class);
    @Autowired
    private TimerUrlRepository timerUrlRepository;
    
    @Override
    public void run() {
        try {
            //在这里写你要执行的内容
            int v = (int) (1 + Math.random() * (59 - 1 + 1)) * 50 * 1000;//先随机暂停1到 59分  任意一个时间段
            //随机睡眠一段时间
            Thread.sleep(v);
            v = (int) (1 + Math.random() * (4 - 1 + 1));
            //9点17 分 46秒 开始，随机选取时间跨度
            int c = v * 60 * 60 * 1000;
            if (1 == v) {
                //随机睡眠一段时间
                Thread.sleep(c);
            } else if (2 == v) {
                //随机睡眠一段时间
                Thread.sleep(c);
            } else if (3 == v) {
                //随机睡眠一段时间
                Thread.sleep(c);
            }
            String s = httpsRequest("https://app.eq28.cn/wapUser/signIn?token=b6bce4a1-5b2d-4344-b404-49d2350d8535", "GET", null);
            
            
            System.out.println(s);
            //奇哥 签到--随机随眠一段时间
            int 黄卓琪 = (int) (1 + Math.random() * (30 - 1 + 1)) * 50 * 1000;//先随机暂停1到 59分  任意一个时间段
            //随机睡眠一段时间
            Thread.sleep(黄卓琪);
            s = httpsRequest("https://app.eq28.cn/wapUser/signIn?token=95a044af-389b-43a7-8948-5262dfd7b1a4", "GET", null);
            System.out.println(s);
            
            
        } catch (Exception e) {
            log.info("-------------解析信息发生异常--------------" + e);
        } finally {
            String s = httpsRequest("https://app.eq28.cn/wapUser/signIn?token=7e193129-2912-493a-b377-07fdfe779fd6", "GET", null);
            System.out.println(s);
            int 黄卓琪 = (int) (1 + Math.random() * (30 - 1 + 1)) * 50 * 1000;//先随机暂停1到 59分  任意一个时间段
            //随机睡眠一段时间
            try {
                Thread.sleep(黄卓琪);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s = httpsRequest("https://app.eq28.cn/wapUser/signIn?token=95a044af-389b-43a7-8948-5262dfd7b1a4", "GET", null);
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        String s = httpsRequest("https://app.eq28.cn/wapUser/signIn?token=b6bce4a1-5b2d-4344-b404-49d2350d8535", "GET", null);
        //发送邮件提醒
        
        
    }
    
    */
/*
     * 处理https GET/POST请求
     * 请求地址、请求方法、参数
     * *//*

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


*/
