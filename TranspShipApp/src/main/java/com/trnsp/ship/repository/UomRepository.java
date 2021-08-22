package com.trnsp.ship.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trnsp.ship.entity.Uom;

public interface UomRepository extends JpaRepository<Uom, Serializable> {

}
