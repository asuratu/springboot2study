package top.jacktgq.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author AsuraTu
 */
@SpringBootTest
public class BookMapperTest {

    @Autowired
    BookMapper $bookMapper;

    @Test
    void testGetById() {
        System.out.println($bookMapper.getBookById(1));
    }
}
