package top.jacktgq.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jacktgq.domain.Book;

/**
 * @author AsuraTu
 */
@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    Book getBookById(Integer id);
}
