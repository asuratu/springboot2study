package top.jacktgq.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.logging.log4j.util.Strings;
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
        bookMapper.selectList(null);
    }

    @Test
    void testSelectPage() {
        IPage<Book> page = new Page<>(2, 2);
        bookMapper.selectPage(page, null);
        // 获取当前页数
        System.out.println(page.getCurrent());
        // 获取总页数
        System.out.println(page.getPages());
        // 获取每页显示的条数
        System.out.println(page.getSize());
        // 获取总记录数
        System.out.println(page.getTotal());
        // 获取当前页的数据
        System.out.println(page.getRecords());
    }

    // 条件查询
    @Test
    void testGetByWrapper() {
        // 创建条件构造器
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        // 设置条件
        // wrapper.eq("type", "编程语言");
        wrapper.like("name", "Java");
        // 查询
        List<Book> books = bookMapper.selectList(wrapper);
        books.forEach(System.out::println);
    }

    @Test
    void testGetByLambdaWrapper() {

        // String type = "编程语言";
        String type = null;

        // 创建条件构造器
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        // 设置条件
        // wrapper.eq(type != null, Book::getType, type); // 第一个参数为true时，才会执行后面的条件
        wrapper.eq(Strings.isNotEmpty(type), Book::getType, type); // 第一个参数为true时，才会执行后面的条件
        // 查询
        List<Book> books = bookMapper.selectList(wrapper);
        books.forEach(System.out::println);
    }
}
