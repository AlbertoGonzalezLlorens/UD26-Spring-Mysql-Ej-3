package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
