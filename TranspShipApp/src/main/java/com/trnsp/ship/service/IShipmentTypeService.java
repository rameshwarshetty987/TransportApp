package com.trnsp.ship.service;

import java.util.List;
import java.util.Optional;

import com.trnsp.ship.entity.ShipmentType;

public interface IShipmentTypeService {
	
	
	public ShipmentType createShipmentType(ShipmentType shipmentType);
	
	public List<ShipmentType> getAllShipmentType();

	public void deleteShipment(Long id);
	
	public Optional<ShipmentType> findByID(Long id);

	public ShipmentType updateShipmentType(ShipmentType shipmentType);
	

}
