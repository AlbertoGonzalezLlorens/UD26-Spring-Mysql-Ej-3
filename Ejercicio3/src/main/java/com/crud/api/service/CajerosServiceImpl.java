package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.ICajerosDAO;
import com.crud.api.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	ICajerosDAO iCajerosDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajero) {
		
		return iCajerosDAO.save(cajero);
	}

	@Override
	public Cajeros cajeroXID(int codigo) {
		
		return iCajerosDAO.findById(codigo).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros cajero) {
		
		return iCajerosDAO.save(cajero);
	}

	@Override
	public void eliminarCajeros(int codigo) {
		
		iCajerosDAO.deleteById(codigo);
		
	}

}