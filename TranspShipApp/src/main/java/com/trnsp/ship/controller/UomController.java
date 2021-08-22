package com.trnsp.ship.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnsp.ship.entity.Uom;
import com.trnsp.ship.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {
	
	@Autowired
	private IUomService uomService;
	
    @RequestMapping(value="/register",method = RequestMethod.GET)
	public String uomRegister(Model model) {
    	model.addAttribute("uom", new Uom());
		return "UomData";
	}
	
    
    @RequestMapping(value="/create",method = RequestMethod.POST)
    public String createUom(@ModelAttribute Uom uom, Model model) {
    	
    	uomService.createUom(uom);
    	String msg;
    	
    	msg="Uom created '"+uom.getId()+"' successfully";
    	model.addAttribute("message", msg);
    	
    	return "UomData";
    }
    
    @RequestMapping(value = "/fetch",method = RequestMethod.GET)
    public String fetchAll(Model model) {
    	List<Uom> all = uomService.getAll();

    	model.addAttribute("all", all);
    	return "DisplayUom";
    	
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable Long id,Model model) {
    	uomService.remove(id);
    	
    	String msg;
    	msg="Record '"+id+"' deleted succesfully!!";
    	model.addAttribute("message", msg);
    	
    	List<Uom> all = uomService.getAll();
    	model.addAttribute("all", all);
    	return "DisplayUom";
    }
	
    
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String getOne(@PathVariable Long id,Model model) {
    	
    	Optional<Uom> byId = uomService.findById(id);
    	String page;
		if(byId.isPresent()) {
    		Uom uom = byId.get();
    		model.addAttribute("uom", uom);
    		
    		page="EditUom";
    	}else {
    		page="redirect:../fetch";
    	}
    	return page;
    }
    
    
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(@ModelAttribute Uom uom, Model model) {
    	
    	uomService.update(uom);
    	String msg;
    	
    	msg="Record'"+uom.getId()+"'updated successfully !!";
    	model.addAttribute("message", msg);
    	
    	List<Uom> all = uomService.getAll();
    	model.addAttribute("all", all);
    	return "DisplayUom";
    }
    
}
