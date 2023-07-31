package top.jacktgq.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.jacktgq.mapper.BookMapper;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.IBookService;

/**
 * @author AsuraTu
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Override
    public boolean save(Book book) {
        // @NotNull 注解是为了防止空指针异常, 但是这里不会出现空指针异常, 所以可以不用加
        book.setName("MybatisPlus " + book.getName());
        return super.save(book);
    }

    // 分页查询
    @Override
    public Page<Book> pageList(Integer page, Integer size) {
        Page<Book> bookPage = new Page<>(page, size);
        baseMapper.selectPage(bookPage, null);
        return bookPage;
    }
}
