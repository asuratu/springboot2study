package top.jacktgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jacktgq.mapper.BookMapper;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.BookService;

import java.util.List;

/**
 * @author AsuraTu
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        return bookMapper.insert(book) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateById(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.selectList(null);
    }
}
