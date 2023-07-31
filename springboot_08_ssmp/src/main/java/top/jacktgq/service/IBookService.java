package top.jacktgq.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import top.jacktgq.pojo.Book;

/**
 * @author AsuraTu
 */
public interface IBookService extends IService<Book> {
    // 分页查询
    Page<Book> pageList(Integer page, Integer size);
}
