package com.uni.desa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.desa.dto.usuariosDTO;
import com.uni.desa.service.usuariosService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class usuarioController {

	@Autowired
	usuariosService usuariosService;
	
	@GetMapping("/getById/{usuacodi}")
	public ResponseEntity<usuariosDTO> getUsuarioById(@PathVariable("usuacodi") Long usuacodi) throws Exception{
		
		usuariosDTO user = usuariosService.getUsuariosByUsuacodi(usuacodi);
		
		return ResponseEntity.ok(user);
	}
}
