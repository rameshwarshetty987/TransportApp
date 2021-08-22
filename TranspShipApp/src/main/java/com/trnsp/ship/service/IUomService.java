package com.trnsp.ship.service;

import java.util.List;
import java.util.Optional;

import com.trnsp.ship.entity.Uom;

public interface IUomService {

	public Uom createUom(Uom uom);

	public List<Uom> getAll();

	public void remove(Long id);

	public Optional<Uom> findById(Long id);

	public Uom update(Uom uom);
	
}
