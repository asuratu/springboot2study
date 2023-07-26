package top.jacktgq.dao.impl;

import org.springframework.stereotype.Repository;
import top.jacktgq.dao.BookDao;

/**
 * @author asura
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...");
    }
}
