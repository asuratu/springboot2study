package top.jacktgq.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author AsuraTu
 */
@TableName(value = "users", keepGlobalPrefix = true)
public class User {
    private Integer id;
    private String name;
    private String avatar;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
