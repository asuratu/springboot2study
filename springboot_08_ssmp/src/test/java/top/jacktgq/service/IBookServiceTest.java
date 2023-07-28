package top.jacktgq.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @author AsuraTu
 */
@SpringBootTest
public class IBookServiceTest {

    // 业务层的方法必须要写测试用例的 !!!!!!!!!

    @Autowired
    IBookService bookService;

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
        System.out.println(bookService.removeById(32));
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
        List<Book> all = bookService.list();
        for (Book book : all) {
            System.out.println(book);
        }
    }

    @Test
    void testGetAllByPage() {
        Page<Book> bookPage = new Page<>(2, 3);
        bookService.page(bookPage);

        List<Book> records = bookPage.getRecords();
        for (Book record : records) {
            System.out.println(record);
        }
    }
}
