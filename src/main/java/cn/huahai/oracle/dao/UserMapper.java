package cn.huahai.oracle.dao;

import org.apache.ibatis.annotations.Param;

import cn.huahai.oracle.bean.User;
import cn.huahai.oracle.bean.UserClass;

public interface UserMapper {
	
	/**
	 * 根据用户名查询user对象
	 * @param name 用户名
	 * @return user 如果查到用户名返回的是user对象 如果没有返回null；
	 */
	UserClass[] selectAll();
	/*测试1*/
//	User selectAllUser();
	/**
	 * test2
	 * @param userclass
	 */
	void insertUser (@Param("id") Integer id,@Param("className")String classname);

}
