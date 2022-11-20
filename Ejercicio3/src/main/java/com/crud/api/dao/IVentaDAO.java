package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
