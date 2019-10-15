package com.spring.di.bean;

import org.springframework.util.StringUtils;

public class XmlPNamespace {

	private String name = null;
	private XmlPNamespace obj = null;

	public String getName() {
		System.out.println("name = " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public XmlPNamespace getObj() {
		String objName = "null";
		if (obj != null) {
			objName = obj.getName();
		}

		System.out.println("obj = " + objName);
		return obj;
	}

	public void setObj(XmlPNamespace obj) {
		this.obj = obj;
	}

}
