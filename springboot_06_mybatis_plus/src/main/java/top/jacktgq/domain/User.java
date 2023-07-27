package top.jacktgq.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author AsuraTu
 */
@Component
@Data
@TableName(value = "users", keepGlobalPrefix = true)
public class User {
    private Integer id;
    private String name;
    private String avatar;
}
