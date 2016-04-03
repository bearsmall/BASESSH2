package com.xy.service;

import com.xy.model.User;

public interface UserServiceInter extends BaseServiceInter<Integer,User>{
	//扩展的方法
	public void transaction();
}
