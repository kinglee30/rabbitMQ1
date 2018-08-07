package com.example.demo.service;

import com.example.demo.bean.Customer;

public interface CustomerService {
	public int insert(Customer c);
	public int update(Customer c);
	public int deleteById(int id);
	public Customer selectById(int id);
}
