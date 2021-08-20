package com.trnsp.ship.service;

import java.util.List;

import com.trnsp.ship.entity.ShipmentType;

public interface ShipmentTypeService {
	
	
	public ShipmentType createShipmentType(ShipmentType shipmentType);
	
	public List<ShipmentType> getAllShipmentType();

	public void deleteShipment(Long id);
	

}
