package com.trnsp.ship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnsp.ship.entity.OrderMethod;
import com.trnsp.ship.service.IOrderMethodService;

@Controller
@RequestMapping(value="/order")
public class OrderMethodController {

	 @Autowired
	 private IOrderMethodService orderMethodService;
	
	
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String orderForm(Model model) {
		model.addAttribute("orderMethod", new OrderMethod());
		return "OrderForm";
	}
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createOrder(@ModelAttribute OrderMethod orderMethod,Model model) {
		orderMethodService.create(orderMethod);
		String msg;
		
		msg="Order '"+orderMethod.getOrdrId()+"' created successfully!!";
		model.addAttribute("message", msg);
		return "OrderForm";
	}
	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
	public String getAllOrder(Model model) {
		 List<OrderMethod> fetchAll = orderMethodService.fetchAll();
		 
		 model.addAttribute("list", fetchAll);
		return "DisplayOrder";
	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model) {
		orderMethodService.remove(id);
		String msg;
		
		msg="Order '"+id+"' deleted successfully";
		model.addAttribute("message", msg);
		
		List<OrderMethod> fetchAll = orderMethodService.fetchAll();
		 model.addAttribute("list", fetchAll);
		return "DisplayOrder";
	}
	
	@RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
	public String getOne(@PathVariable Long id,Model model) {
		OrderMethod one = orderMethodService.getOne(id);
		
		model.addAttribute("getOne", one);
		return "EditOrderForm";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(@ModelAttribute OrderMethod orderMethod,Model model) {
		
		 orderMethodService.update(orderMethod);
		String msg;
		msg="order '"+orderMethod.getOrdrId()+"'updated successfully !!";
		model.addAttribute("message", msg);
		
		List<OrderMethod> fetchAll = orderMethodService.fetchAll();
		 model.addAttribute("list", fetchAll);
		return "DisplayOrder";
	}
	
}
