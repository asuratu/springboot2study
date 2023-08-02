package top.jacktgq.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import top.jacktgq.controller.utils.PageResponse;
import top.jacktgq.controller.utils.R;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.IBookService;

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
    public R index() {
        return new R(true, bookService.list());
    }

    // 保存书籍
    @PostMapping
    public R save(@RequestBody Book book) {
        bookService.save(book);
        return new R(true, "add success");
    }

    @PutMapping("/{id}")
    public R update(@RequestBody Book book, @PathVariable("id") Integer id) {
        book.setId(id);
        bookService.updateById(book);
        return new R(true, "update success");
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") Long id) {
        bookService.removeById(id);
        return new R(true, "delete success");
    }

    @GetMapping("/page-list")
    public R pageList(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        Page<Book> bookPage = bookService.pageList(page, size);

        // 如果当前页面值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (page > bookPage.getPages()) {
            bookPage = bookService.pageList((int) bookPage.getPages(), size);
        }

        PageResponse<Book> response = new PageResponse<>();
        return new R(true, response.getPageResponse(bookPage));
    }

    @GetMapping("/{id}")
    public R get(@PathVariable("id") Long id) {
        if (id == 22) {
            throw new RuntimeException("人为故障测试...");
        }
        return new R(true, bookService.getById(id));
    }

}
