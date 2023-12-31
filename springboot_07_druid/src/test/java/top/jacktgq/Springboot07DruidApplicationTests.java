package top.jacktgq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.dao.BookDao;

@SpringBootTest
class Springboot07DruidApplicationTests {

    @Autowired
    private BookDao $bookDao;

    @Test
    void contextLoads() {
        System.out.println($bookDao.getBookById(1));
    }
}
