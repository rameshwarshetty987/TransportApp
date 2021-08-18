package com.trnsp.ship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="shipment_tab")
public class ShipmentType {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="ship_mode")
	private String shipmentMode;
	
	@Column(name="ship_code")
	private String shipmentCode;
	
	@Column(name="enable_ship")
	private String enableShipment;
	
	@Column(name="ship_grade")
	private String shipmentGrade;
	
	@Column(name="ship_descrp")
	private String shipmentDescrp;

}
