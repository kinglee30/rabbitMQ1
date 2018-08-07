package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int f_id;
	private String f_tbname;//淘宝名
	private String t_wname;//微信名
	private String f_phone;
	public String getF_phone() {
		return f_phone;
	}
	public void setF_phone(String f_phone) {
		this.f_phone = f_phone;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_tbname() {
		return f_tbname;
	}
	public void setF_tbname(String f_tbname) {
		this.f_tbname = f_tbname;
	}
	public String getT_wname() {
		return t_wname;
	}
	public void setT_wname(String t_wname) {
		this.t_wname = t_wname;
	}
}
