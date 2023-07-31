package top.jacktgq.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.IBookService;

import java.util.List;

/**
 * @author AsuraTu
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    /**
     * 查询全部书籍
     * @return List<Book> 书籍列表
     */
    @GetMapping
    public List<Book> index() {
        return bookService.list();
    }

    // 保存书籍
    @PostMapping
    public String save(@RequestBody Book book) {
        bookService.save(book);
        return "success";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody Book book, @PathVariable("id") Integer id) {
        System.out.println(">>>>>> id = " + id);
        book.setId(id);
        bookService.updateById(book);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        bookService.removeById(id);
        return "success";
    }

    @GetMapping("/page-list")
    public List<Book> pageList(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        Page<Book> bookPage = bookService.pageList(page, size);
        return bookPage.getRecords();
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable("id") Long id) {
        return bookService.getById(id);
    }
    
}
