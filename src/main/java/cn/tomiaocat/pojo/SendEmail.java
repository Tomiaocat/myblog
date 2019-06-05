package cn.tomiaocat.pojo;

import org.springframework.mail.SimpleMailMessage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author : double
 * @date :2018/3/13 11:54
 * 验证用户 邮箱
 */
@Entity
public class SendEmail extends SimpleMailMessage {
    @Id
    @GeneratedValue
    private int id;
    
    
    private String email;
    private String content;
    private Date createTime;
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public int getId() {
        return id;
    }
    private Integer status = 0;//默认0 1为成功发送
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
