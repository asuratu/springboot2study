package top.jacktgq.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.pojo.Book;

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
    }

    @Test
    void testGetById() {
        System.out.println(bookMapper.getBookById(1));
    }
}
