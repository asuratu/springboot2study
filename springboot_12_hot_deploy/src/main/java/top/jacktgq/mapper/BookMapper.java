package top.jacktgq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jacktgq.pojo.Book;

/**
 * @author AsuraTu
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    // 不使用MyBatisPlus时，使用@Mapper注解
    @Select("select * from tbl_book where id = #{id}")
    Book getBookById(Integer id);
}
