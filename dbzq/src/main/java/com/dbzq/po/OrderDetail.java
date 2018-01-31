package com.dbzq.po;

public class OrderDetail {
   private int id;
   private int orders_id;
   private int items_id;
   private Items items;
public Items getItems() {
	return items;
}
public void setItem(Items items) {
	this.items = items;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getOrders_id() {
	return orders_id;
}
public void setOrders_id(int orders_id) {
	this.orders_id = orders_id;
}
public int getItems_id() {
	return items_id;
}
public void setItems_id(int items_id) {
	this.items_id = items_id;
}
}
