package com.trnsp.ship.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<ShipmentType> getAllShipmentType() {
		return shipmentTypeRepository.findAll();
	}

	@Override
	public void deleteShipment(Long id) {
		shipmentTypeRepository.deleteById(id);
	}

	@Override
	public Optional<ShipmentType> findByID(Long id) {
		
		Optional<ShipmentType> byId = shipmentTypeRepository.findById(id);
		return byId;
	}

	@Override
	public ShipmentType updateShipmentType(ShipmentType shipmentType) {
		return shipmentTypeRepository.save(shipmentType);
	}

}
