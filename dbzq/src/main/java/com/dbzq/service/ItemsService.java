package com.dbzq.service;

import java.util.List;

import com.dbzq.po.ItemsQuerVo;
import com.dbzq.po.ItemsCustom;

public interface ItemsService {
	public List<ItemsCustom> findItemlist(ItemsQuerVo itemQuerVo) throws Exception;
	public  ItemsCustom findItemByID(int id)throws Exception;
	public void updateItems(Integer id,ItemsCustom itemsCustom)throws Exception;


}
