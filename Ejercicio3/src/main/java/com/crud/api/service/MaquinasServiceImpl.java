package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IMaquinasDAO;
import com.crud.api.dto.Maquinas;

@Service
public class MaquinasServiceImpl implements IMaquinasService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IMaquinasDAO iMaquinasDAO;

	@Override
	public List<Maquinas> listarMaquinas() {
		
		return iMaquinasDAO.findAll();
	}

	@Override
	public Maquinas guardarMaquinas(Maquinas maquina) {
		
		return iMaquinasDAO.save(maquina);
	}

	@Override
	public Maquinas maquinaXID(int codigo) {
		
		return iMaquinasDAO.findById(codigo).get();
	}

	@Override
	public Maquinas actualizarMaquinas(Maquinas maquina) {
		
		return iMaquinasDAO.save(maquina);
	}

	@Override
	public void eliminarMaquinas(int codigo) {
		
		iMaquinasDAO.deleteById(codigo);
		
	}

}