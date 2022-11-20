package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Maquinas;

public interface IMaquinasDAO extends JpaRepository<Maquinas, Integer>{

}
