package cn.gx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.gx.entity.Types;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesDao {
    int deleteById(Integer id);

    int insert(Types record);

    int insertSelective(Types record);

    Types selectById(Integer id);

    int updateByIdSelective(Types record);

    int updateById(Types record);    

    
	/**
	 * 获取列表
	 * @return
	 */
    @Select("select * from types order by id desc")
	List<Types> getList();
    
}