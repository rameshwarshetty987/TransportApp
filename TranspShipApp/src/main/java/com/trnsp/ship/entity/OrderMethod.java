package com.trnsp.ship.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_method_tab")
public class OrderMethod {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long ordrId;
	
	@Column(name="order_mode")
	private String orderMode;
	
	@Column(name="order_code")
	private String orderCode;
	
	@Column(name="orderType")
	private String orderType;
	
	@ElementCollection
	@CollectionTable(name="order_acpt_tab",
	                 joinColumns=@JoinColumn(name="ordr_id")
					)
	@Column(name="order_acpt")
	private List<String> orderAccept; //for multiple checkbox
	
	@Column(name="order_descrip")
	private String orderDescrip;
	
}
