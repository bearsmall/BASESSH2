package com.xy.dao;

import com.xy.model.User;

public interface UserDaoInter extends BaseDaoInter<Integer,User>{
	//扩展的方法
	public void addedFunction();
}
