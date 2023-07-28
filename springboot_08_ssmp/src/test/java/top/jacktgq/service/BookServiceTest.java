package top.jacktgq.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @author AsuraTu
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("Golang");
        book.setType("编程语言");
        book.setDescription("Go不是一门面向对象的编程语言");

        System.out.println(bookService.save(book));
    }

    @Test
    void testDeleteById() {
        System.out.println(bookService.deleteById(31));
    }

    @Test
    void testUpdateById() {
        Book book = new Book();
        book.setId(32);
        book.setName("Golang22");
        book.setType("编程语言22");
        book.setDescription("11Go不是一门面向对象的编程语言");

        System.out.println(bookService.updateById(book));
    }

    @Test
    void testGetById() {
        System.out.println(bookService.getById(32));
    }

    @Test
    void testGetAll() {
        List<Book> all = bookService.getAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
