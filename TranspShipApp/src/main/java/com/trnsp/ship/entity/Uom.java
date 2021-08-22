package com.trnsp.ship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="uom_tab")
public class Uom {

	@Id
	@GeneratedValue
	@Column(name="id",length=200,nullable = false)
	private Long id;
	
	@Column(name="uom_type")
	private String uomType;
	
	@Column(name="uom_model")
	private String uomModel;
	
	@Column(name="uom_descrip")
	private String uomDescrip;
	
	
}
