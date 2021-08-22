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
	@Column(name="id",length=200,nullable = false)
	private Long id;
	
	@Column(name="ship_mode",nullable = false)
	private String shipmentMode;
	
	@Column(name="ship_code",nullable = false)
	private String shipmentCode;
	
	@Column(name="enable_ship",nullable = false)
	private String enableShipment;
	
	@Column(name="ship_grade",nullable = false)
	private String shipmentGrade;
	
	@Column(name="ship_descrp")
	private String shipmentDescrp;

}
