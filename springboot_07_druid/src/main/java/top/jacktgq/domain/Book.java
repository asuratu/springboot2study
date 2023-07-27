package top.jacktgq.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author AsuraTu
 */
@Component
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
