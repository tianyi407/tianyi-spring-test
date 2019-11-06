package com.spring.annotation3.bean;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	public void add() {
		 System.out.println("Dao层的add()方法执行了...");
	}

}
