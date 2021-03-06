package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.OrdersdetailMapper;
import com.multi.vo.OrdersdetailVO;

@Service("ordersdetailbiz")
public class OrdersdetailBiz implements Biz<Integer,OrdersdetailVO> {

	@Autowired
	OrdersdetailMapper dao;
	
	@Override
	public void register(OrdersdetailVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(OrdersdetailVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public OrdersdetailVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<OrdersdetailVO> get() throws Exception {
		return dao.selectall();
	}
	public OrdersdetailVO selectcodeno(int codeno) throws Exception {
		return dao.selectcodeno(codeno);
	}
	public Integer selectlast() throws Exception {
		return dao.selectlast();
	}
}
