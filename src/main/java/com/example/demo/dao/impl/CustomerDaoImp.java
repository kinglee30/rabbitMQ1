package com.example.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Customer;
import com.example.demo.dao.CustomerDao;
@Repository
//持久层注解
public class CustomerDaoImp implements CustomerDao{
	@Autowired JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Customer customer) {
		String sql = "insert into customer (f_id, f_tbname,f_wname,f_phone)"
				+ " values (?, ?,?,?)";
		return jdbcTemplate.update(sql,customer.getF_id(),customer.getF_tbname(),
				customer.getT_wname(),customer.getF_phone());
	}

	@Override
	public int update(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
