package com.trnsp.ship.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trnsp.ship.entity.OrderMethod;

public interface OrderMethodRepository extends JpaRepository<OrderMethod, Serializable>{

}
