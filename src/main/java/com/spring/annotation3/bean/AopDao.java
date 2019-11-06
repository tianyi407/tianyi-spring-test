package com.spring.annotation3.bean;

import org.springframework.stereotype.Repository;

@Repository("aopDao")
public class AopDao {

	public void add() {
		System.out.println("添加客户...");
	}

	public void update() {
		System.out.println("修改客户...");
	}

	public void delete() {
		System.out.println("删除客户...");
	}

	public void find() {
		System.out.println("修改客户...");
	}
}
