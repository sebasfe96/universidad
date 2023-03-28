package com.uni.desa.service;

import org.springframework.stereotype.Service;

import com.uni.desa.dto.usuariosDTO;

@Service
public interface usuariosService {

	 usuariosDTO getUsuariosByUsuacodi(Long usuacodi);
}
