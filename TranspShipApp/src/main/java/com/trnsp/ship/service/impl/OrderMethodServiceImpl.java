package com.trnsp.ship.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trnsp.ship.entity.OrderMethod;
import com.trnsp.ship.repository.OrderMethodRepository;
import com.trnsp.ship.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService{
	
	@Autowired
	private OrderMethodRepository orderMethodRepository;
	
@Override
public OrderMethod create(OrderMethod orderMethod) {
	return orderMethodRepository.save(orderMethod);
}

@Override
public List<OrderMethod> fetchAll() {
	return orderMethodRepository.findAll();
}

@Override
public void remove(Long id) {
orderMethodRepository.deleteById(id);
}

@Override
public OrderMethod getOne(Long id) {
	
	return orderMethodRepository.getById(id);
}

@Override
public OrderMethod update(OrderMethod orderMethod) {
	
	return orderMethodRepository.save(orderMethod);
}
}
