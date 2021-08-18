package com.trnsp.ship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnsp.ship.entity.ShipmentType;
import com.trnsp.ship.service.ShipmentTypeService;

@Controller
@RequestMapping(value="/ship")
public class ShipmentTypeController {
	
	@Autowired
	private ShipmentTypeService shipmentTypeService;
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String displayRegisterPage(){
	
		return "ShipmentType";
	}

	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createShipment(@ModelAttribute ShipmentType shipmentType,Model model) {
		ShipmentType id = shipmentTypeService.createShipmentType(shipmentType);
		String msg="Shipment Type "+shipmentType.getId()+" Saved Successfully !!";
		model.addAttribute("message", msg);
		return "ShipmentType";
	}
	
	
}
