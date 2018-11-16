package cn.tomiaocat.pojo;

import javax.persistence.*;

/**
 * @author : double
 * @date :2018/7/21 10:47
 */
@Entity
@Table(name = "t_content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String title;//文章标题
    @Column(length = 500)
    private String content;
    private String wx_id;
    private String password;
    private String email;
}
