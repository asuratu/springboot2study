package top.jacktgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.IBookService;

import java.util.List;

/**
 * @author AsuraTu
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    /**
     * 查询全部书籍
     *
     * @return List<Book> 书籍列表
     */
    @GetMapping
    public List<Book> index() {
        return bookService.list();
    }
}
