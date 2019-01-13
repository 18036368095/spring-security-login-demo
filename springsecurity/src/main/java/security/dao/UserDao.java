package security.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import security.domain.User;

@Mapper
public interface UserDao {

    User findUserByName(@Param("userName") String name);
}
