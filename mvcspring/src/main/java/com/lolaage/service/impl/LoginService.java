package com.lolaage.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lolaage.mapper.ILoginMapper;
import com.lolaage.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	@Resource
	private ILoginMapper logindao;

	/**
	 * 验证是否登录成功
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 验证帐号和密码是否正确
	 */
	@Override
	public boolean Login(String username, String password) {

		return null == logindao.Login(username, password) ? false : true;
	}

}
