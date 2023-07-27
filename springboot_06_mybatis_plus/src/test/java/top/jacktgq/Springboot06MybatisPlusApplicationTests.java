package top.jacktgq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.dao.BookDao;
import top.jacktgq.dao.UserDao;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao $bookDao;

    @Autowired
    private UserDao $userDao;

    @Test
    void contextLoads() {
        System.out.println(">>>>>>>>> 查询书籍: ");
        System.out.println($bookDao.selectById(1));
    }

    @Test
    void testUser() {
        System.out.println(">>>>>>>>> 查询用户: ");
        System.out.println($userDao.selectById(1));
    }

}
