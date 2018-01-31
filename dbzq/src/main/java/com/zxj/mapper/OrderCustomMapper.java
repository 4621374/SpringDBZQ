package com.zxj.mapper;

import java.util.List;

import com.dbzq.po.Order;
import com.dbzq.po.OrderCustom;
import com.dbzq.po.User;

public interface OrderCustomMapper {
  public List<OrderCustom> findOrderUserlist() throws Exception;
  public List<Order> findOrderUserlistMap() throws Exception;
  public List<Order> findOrderUserlistMap2() throws Exception;
  public List<Order> findOrderDetaillistMap() throws Exception;

  	  
  
}
