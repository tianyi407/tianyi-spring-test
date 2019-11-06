package com.spring.annotation3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	public void add() {
		personDao.add();// 调用personDao中的add()方法
		System.out.println("Service层的add()方法执行了...");
	}

}
