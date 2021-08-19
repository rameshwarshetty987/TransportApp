package com.trnsp.ship.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	
	
	private static Logger logger=LoggerFactory.getLogger(ShipmentTypeController.class);
	
	@Autowired
	private ShipmentTypeService shipmentTypeService;
	
	
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String displayRegisterPage(){
	  logger.info("display regisitration page");
		return "ShipmentType";
	}

	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createShipment(@ModelAttribute ShipmentType shipmentType,Model model) {
		logger.info("shipment created");
		ShipmentType id = shipmentTypeService.createShipmentType(shipmentType);
		String msg="Shipment Type "+shipmentType.getId()+" Saved Successfully !!";
		model.addAttribute("message", msg);
		return "ShipmentType";
	}
	
	@RequestMapping(value="/fetch",method = RequestMethod.GET)
	public String getAllShipment(Model model) {
		logger.info("get all shipment");
		List<ShipmentType> listOfShipment = shipmentTypeService.getAllShipmentType();
		model.addAttribute("display", listOfShipment);
		return "DisplayShipment";
	}
	
	
}
