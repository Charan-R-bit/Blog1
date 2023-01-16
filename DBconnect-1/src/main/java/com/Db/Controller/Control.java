package com.Db.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Db.Entity.Entity;
import com.Db.Service.Service;

@Controller
@RequestMapping("/control")
public class Control 
{
	@Autowired
	Service service;
	@GetMapping("/get")
	@ResponseBody
	public Entity  get()
	{
		return service.getEmp();
//		return service.getEmp();
	}
}
