package com.exercise27mvchelloworld.model;

public class UserBean {
	private int id;
	private String name;
	private short age;
	
	public UserBean()
	{
	}
	public UserBean(int id)
	{
		this.id = id;
		this.name="";
		this.age=0;
	}
	public UserBean(int id, String name, short age)
	{
		this.id = id;
		this.name=name;
		this.age=age;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public short getAge()
	{
		return age;
	}
	public void setAge(short age)
	{
		this.age = age;
	}
}
