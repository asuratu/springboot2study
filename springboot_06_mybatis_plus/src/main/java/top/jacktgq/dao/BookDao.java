package top.jacktgq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.jacktgq.domain.Book;

/**
 * @author AsuraTu
 */
@Mapper // 表示这是一个mybatis的mapper类
public interface BookDao extends BaseMapper<Book> {

}
