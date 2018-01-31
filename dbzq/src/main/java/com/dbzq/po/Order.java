package com.dbzq.po;

import java.util.Date;
import java.util.List;

public class Order {
	@Override
	public String toString() {
		return "Order [id=" + id + ", user_id=" + u_id + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + "]";
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	private int id;
	private int u_id;
	private String number;
	private Date createtime;
	private User user;
	private String note ;
	private List<OrderDetail> orderDetails;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
