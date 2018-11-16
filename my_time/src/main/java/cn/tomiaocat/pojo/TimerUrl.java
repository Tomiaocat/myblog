package cn.tomiaocat.pojo;

import javax.persistence.*;

/**
 * @author : double
 * @date :2018/8/20 19:27
 *
 * 定时器读取需要请求url 的表
 *
 */
@Entity
@Table(name = "t_timer_url")
public class TimerUrl {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
    private String email;
    private String result;//返回信息
    
    public int getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getResult() {
        return result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }
    
    @Override
    public String toString() {
        return "TimerUrl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
}
