package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private Customer cus;
	@Autowired
	private CustomerService service;
	@RequestMapping(value="/insert", method={RequestMethod.POST,RequestMethod.GET})
	public int insert(@RequestParam("id") int id,@RequestParam("tbname") String name,
			@RequestParam("wname") String wName,@RequestParam("phone") String phone){
		cus.setF_id(id);
		cus.setF_tbname(name);
		cus.setT_wname(wName);
		cus.setF_phone(phone);
		return service.insert(cus);
		
	}
	//@PathVariable是获取url上数据的。
	//@RequestParam获取请求参数的（包括post表单提交）
	@RequestMapping(value="/insert2/{id}/{tbname}/{wname}/{phone}",method=RequestMethod.GET)
	public int insert2(@PathVariable("id") @Valid int id,@PathVariable("tbname") @Valid String name,
			@PathVariable("wname") @Valid String wName,@PathVariable("phone") @Valid String phone){
		cus.setF_id(id);
		cus.setT_wname(wName);
		cus.setF_tbname(name);
		cus.setF_phone(phone);
		return service.insert(cus);
		
	}
	@RequestMapping("/update")
	public String update(){
		cus.setF_id(11);
		cus.setT_wname("111");
		cus.setF_tbname("111");
		cus.setF_phone("111");
		return service.insert(cus)+"";
	}
	@RequestMapping("/test")
	public String test(){
		return "11111";
	}
}
