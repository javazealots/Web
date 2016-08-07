package com.hogan.budget.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hogan.budget.web.dao.UserDao;
import com.hogan.budget.web.service.UserService;

/**
 * 
 * @author Hogan
 * @description
 * @date Aug 6, 2016 5:32:10 PM
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
}
