package com.dbzq.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dbzq.po.Item;
import com.dbzq.po.ItemsQuerVo;
import com.dbzq.po.Items;
import com.dbzq.po.ItemsCustom;
import com.zxj.mapper.ItemsCustomMapper;
import com.zxj.mapper.ItemsMapper;

public class ItemsServiceImp1 implements ItemsService {
	@Autowired
	private ItemsCustomMapper itemsCustomMapper;
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<ItemsCustom> findItemlist(ItemsQuerVo itemQuerVo) throws Exception {
		// TODO Auto-generated method stub
		return itemsCustomMapper.findItemlist(itemQuerVo);
	}

	@Override
	public ItemsCustom findItemByID(int id) throws Exception {
		// TODO Auto-generated method stub
		Items items=itemsMapper.selectByPrimaryKey(id);
		ItemsCustom itemsCustom=new ItemsCustom();
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}

	@Override
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception {
		// TODO Auto-generated method stub
		if (id==null) {
			
		}
		itemsMapper.updateByPrimaryKey(itemsCustom);
		
	}

}
