package cn.tomiaocat.pojo;


import javax.persistence.*;


@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String name;
    
    private String qq_id;
    private String wx_id;
    private String password;
    private String email;
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getQq_id() {
        return qq_id;
    }
    
    public String getWx_id() {
        return wx_id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQq_id(String qq_id) {
        this.qq_id = qq_id;
    }
    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }
    
    
}
