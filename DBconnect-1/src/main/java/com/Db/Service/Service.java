package com.Db.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Db.Entity.Entity;

@Component
public class Service 
{
	Entity entity;
	ArrayList<Entity> emp = new ArrayList<Entity>();
	public Entity getEmp()
	{
		return new Entity(10, "Charan", 20222.00);
	}
	public Entity getEmpid(int id)
	{
		
		
	}
}
