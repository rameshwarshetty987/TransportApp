package com.trnsp.ship.service;

import java.util.List;

import com.trnsp.ship.entity.OrderMethod;

public interface IOrderMethodService {

	public OrderMethod create(OrderMethod orderMethod);

	public List<OrderMethod> fetchAll();

	public void remove(Long id);

	public OrderMethod getOne(Long id);

	public OrderMethod update(OrderMethod orderMethod);
}
