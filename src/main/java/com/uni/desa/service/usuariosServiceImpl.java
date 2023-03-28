package com.uni.desa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.desa.dto.usuariosDTO;
import com.uni.desa.repository.usuariosRepositoryImpl;

@Service
public class usuariosServiceImpl implements usuariosService{

	@Autowired
	usuariosRepositoryImpl usuariosRepositoryImpl;
	
	@Override
	public usuariosDTO getUsuariosByUsuacodi(Long usuacodi) {
		// TODO Auto-generated method stub
		return usuariosRepositoryImpl.getUsuariosByUsuacodi(usuacodi);
	}

}
