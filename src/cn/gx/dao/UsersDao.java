package cn.gx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.gx.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao {
    int deleteById(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectById(Integer id);

    int updateByIdSelective(Users record);

    int updateById(Users record);    
    

    
	/**
	 * 通过用户名查找用户
	 * @return 无记录返回null
	 */
    @Select("select * from users where username=#{username}")
	Users getByUsername(String username);
	
	/**
	 * 通过用户名和密码查找
	 * @param username
	 * @param password
	 * @return 无记录返回null
	 */
    @Select("select * from users where username=#{username} and password=#{password}")
	Users getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
	
	/**
	 * 获取列表
	 * @param begin
	 * @param size
	 * @return 无记录返回空集合
	 */
    @Select("select * from users order by id desc limit #{begin}, #{size}")
	List<Users> getList(@Param("begin") int begin, @Param("size") int size);

	/**
	 * 总数
	 * @return
	 */
    @Select("select count(*) from users")
	long getTotal();
	
    
}