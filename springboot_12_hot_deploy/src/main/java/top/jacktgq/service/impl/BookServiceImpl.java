package top.jacktgq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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

    @Override
    public Page<Book> pageList(Integer page, Integer size) {
        Page<Book> bookPage = new Page<>(page, size);
        baseMapper.selectPage(bookPage, null);
        return bookPage;
    }

    @Override
    public Page<Book> pageSearchList(Integer page, Integer size, Book book) {
        Page<Book> bookPage = new Page<>(page, size);

        // 这里的 book 是一个条件对象, 用于封装查询条件
        LambdaQueryWrapper<Book> bookLambdaQueryWrapper = new LambdaQueryWrapper<>();

        bookLambdaQueryWrapper.like(Book::getName, book.getName());
        bookLambdaQueryWrapper.like(Book::getType, book.getType());
        bookLambdaQueryWrapper.like(Book::getDescription, book.getDescription());

        baseMapper.selectPage(bookPage, bookLambdaQueryWrapper);
        return bookPage;
    }
}
