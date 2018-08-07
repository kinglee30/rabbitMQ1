package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Customer;

public interface CustomerDao {

	int insert(Customer customer);
	int update(Customer customer);
	int delete(int id);
	Customer selectById(int id);
}
