package com.trnsp.ship.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	String msg;
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String displayRegisterPage(){
	  logger.info("display regisitration page");
		return "ShipmentType";
	}

	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createShipment(@ModelAttribute ShipmentType shipmentType,Model model) {
		logger.info("shipment created");
		ShipmentType id = shipmentTypeService.createShipmentType(shipmentType);
		msg="Shipment Type "+shipmentType.getId()+" Saved Successfully !!";
		model.addAttribute("message", msg);
		return "ShipmentType";
	}
	
	@RequestMapping(value="/fetch",method = RequestMethod.GET)
	public String getAllShipment(Model model) {
		logger.info("get all shipment");
		List<ShipmentType> listOfShipment = shipmentTypeService.getAllShipmentType();
		model.addAttribute("list", listOfShipment);
		return "DisplayShipment";
	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable Long id ,Model model){
		
		shipmentTypeService.deleteShipment(id);
		msg= "Record delete "+id+" successfully!!";
		model.addAttribute("message", msg);
		
		List<ShipmentType> listOfShipment = shipmentTypeService.getAllShipmentType();
		model.addAttribute("list", listOfShipment);
	return "DisplayShipment";	
	}
	
	
}
