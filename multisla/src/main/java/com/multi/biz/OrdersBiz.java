package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.OrdersMapper;
import com.multi.vo.OrdersVO;

@Service("ordersbiz")
public class OrdersBiz implements Biz<Integer,OrdersVO> {

	@Autowired
	OrdersMapper dao;
	
	@Override
	public void register(OrdersVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(OrdersVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public OrdersVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<OrdersVO> get() throws Exception {
		return dao.selectall();
	}
	public Integer selectlast() throws Exception {
		return dao.selectlast();
	}
	
}
