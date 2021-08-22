package com.trnsp.ship.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trnsp.ship.entity.Uom;
import com.trnsp.ship.repository.UomRepository;
import com.trnsp.ship.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {
	
	@Autowired
	private UomRepository uomRepository;
	
	@Override
	public Uom createUom(Uom uom) {
		return uomRepository.save(uom);
	}

	@Override
	public List<Uom> getAll() {
		return uomRepository.findAll();
	}

	@Override
	public void remove(Long id) {
		uomRepository.deleteById(id);
		
	}

	@Override
	public Optional<Uom> findById(Long id) {
		return uomRepository.findById(id);
	}

	@Override
	public Uom update(Uom uom) {
		Uom update = uomRepository.save(uom);
		return update;
	}
}
