package top.jacktgq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.jacktgq.domain.User;

/**
 * @author AsuraTu
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
