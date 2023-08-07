package top.jacktgq.service;

import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @author AsuraTu
 */
public interface BookService {

    boolean save(Book book);

    boolean deleteById(Integer id);

    boolean updateById(Book book);

    Book getById(Integer id);

    List<Book> getAll();


}
