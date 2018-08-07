package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Customer;
import com.example.demo.dao.CustomerDao;
import com.example.demo.dao.impl.CustomerDaoImp;
import com.example.demo.hello.HelloReceiver1;
import com.example.demo.hello.HelloSender1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
//	@Autowired CustomerDao dao;
	@Autowired Customer customer;
	@Autowired HelloSender1 send;
	@Autowired HelloReceiver1 receiver;
//	@Test
	public void send() {
		send.send();
//		receiver.process("1111");
	}
	@Test
	public void insert(){
		customer.setF_id(1000);
		customer.setF_tbname("随缘pk梦醒");
		customer.setT_wname("微雨");
		customer.setF_phone("15275126932");
		CustomerDaoImp dao = new CustomerDaoImp();
		int row = dao.insert(customer);
		System.out.println(row);
	}
}
