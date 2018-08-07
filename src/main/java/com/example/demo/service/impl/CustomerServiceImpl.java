package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Customer;
import com.example.demo.dao.CustomerDao;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired 
	private CustomerDao dao;
	@Override
	public int insert(Customer c) {
		return dao.insert(c);
	}

	@Override
	public int update(Customer c) {
		return dao.update(c);
	}

	@Override
	public int deleteById(int id) {
		return dao.delete(id);
	}

	@Override
	public Customer selectById(int id) {
		
		return dao.selectById(id);
	}

}
