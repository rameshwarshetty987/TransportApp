package com.trnsp.ship.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trnsp.ship.entity.ShipmentType;
import com.trnsp.ship.repository.ShipmentTypeRepository;
import com.trnsp.ship.service.ShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements ShipmentTypeService{

	@Autowired
	private ShipmentTypeRepository shipmentTypeRepository;
	
	@Override
	public ShipmentType createShipmentType(ShipmentType shipmentType) {
		
		return shipmentTypeRepository.save(shipmentType); 
	}

}
