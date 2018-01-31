package com.zxj.mapper;

import java.util.List;

import com.dbzq.po.ItemsQuerVo;
import com.dbzq.po.ItemsCustom;

public interface ItemsCustomMapper {
	public List<ItemsCustom> findItemlist(ItemsQuerVo itemQuerVo) throws Exception;

}
