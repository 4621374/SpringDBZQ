package com.dbzq.po;

import java.io.Serializable;
import java.util.List;

public class ItemsQuerVo implements Serializable{
	ItemsCustom itemsCustom;
	List<ItemsCustom> itemslist;
	String test;

	public List<ItemsCustom> getItemsList() {
		return itemslist;
	}

	public void setItemslist(List<ItemsCustom> itemsList) {
		this.itemslist = itemsList;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public List<ItemsCustom> getItemslist() {
		return itemslist;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

}
