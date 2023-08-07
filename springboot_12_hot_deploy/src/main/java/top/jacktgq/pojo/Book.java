package top.jacktgq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author asura
 */
@Component
@Data
// @AllArgsConstructor
// @NoArgsConstructor
public class Book {
    // @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String type;
    private String description;
}
