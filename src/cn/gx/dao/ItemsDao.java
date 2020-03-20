package cn.gx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.gx.entity.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
    int deleteById(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectById(Integer id);

    int updateByIdSelective(Items record);

    int updateById(Items record);    
    

    
	
	/**
	 * 订单项列表
	 * @param orderid
	 * @return
	 */
    @Select("select * from items where order_id=#{orderid}")
	List<Items> getItemList(int orderid);
}