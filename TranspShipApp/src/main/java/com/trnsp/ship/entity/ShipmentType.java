package com.trnsp.ship.entity;

import lombok.Data;

@Data
public class ShipmentType {
	
	private Long id;
	
	private String shipmentMode;
	
	private String shipmentCode;
	
	private String enableShipment;
	
	private String shipmentGrade;
	
	private String shipmentDescrp;

}
