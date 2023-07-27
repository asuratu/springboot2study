package top.jacktgq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author asura
 */
@Component
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
