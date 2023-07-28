package top.jacktgq.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @author AsuraTu
 */
@SpringBootTest
public class BookMapperTest {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    Book book;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("Java");
        book.setType("编程语言");
        book.setDescription("Java是一门面向对象的编程语言");

        bookMapper.insert(book);

        Book book1 = new Book();
        book1.setName("神秘岛");
        book1.setType("科幻");
        book1.setDescription("《神秘岛》是法国科幻小说家儒勒·凡尔纳创作的长篇小说，是其三部曲的第三部，全书共3部62章。");

        bookMapper.insert(book1);
    }

    @Test
    void testGetBookById() {
        System.out.println(bookMapper.getBookById(1));
    }

    @Test
    void testSelectById() {
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testDeleteById() {
        System.out.println(bookMapper.deleteById(30)); // 返回值为影响的行数 1
    }

    @Test
    void testSelectAll() {
        List<Book> books = bookMapper.selectList(null);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
