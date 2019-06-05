package cn.tomiaocat.util.dao;

import javax.mail.MessagingException;

/**
 * @author : double
 * @date :2018/8/20 21:03
 */

public interface EmailService {
    
    /**
     * 发送简单邮件
     * @param sendTo 收件人地址
     * @param titel  邮件标题
     * @param content 邮件内容
     */
    public void sendSimpleMail(String sendTo, String titel, String content) throws MessagingException;
    
    
}