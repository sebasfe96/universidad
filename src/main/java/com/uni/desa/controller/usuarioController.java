package com.uni.desa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.desa.domain.usuarios;
import com.uni.desa.dto.usuariosDTO;
import com.uni.desa.repository.usuariosRepository;
import com.uni.desa.service.usuariosService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class usuarioController {

	@Autowired
	usuariosService usuariosService;
	
	@Autowired
	usuariosRepository usuariosRepository;
	
	
	/**
	 * metodo donde se crea parte de la url, para ser consumida en cualquier gestor
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	//metodo para poder utilizar get en la peticion
	@GetMapping("/getById/{usuacodi}")
	public ResponseEntity<usuariosDTO> getUsuarioById(@PathVariable("usuacodi") Long usuacodi) throws Exception{
		
		//se carga el obejto de lo que devuelva el servicio
		usuariosDTO user = usuariosService.getUsuariosByUsuacodi(usuacodi);
		
		return ResponseEntity.ok(user);
	}
	
	/**
	 * metodo donde se crea parte de la url, para ser consumida en cualquier gestor
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	//metodo para poder utilizar get en la peticion
	@GetMapping("/findAllUsuarios")
	public ResponseEntity<List<usuarios>> findAllUsuarios() throws Exception{
		
		//se carga el obejto de lo que devuelva el servicio
		List<usuarios> usuarios = usuariosRepository.findAll();
		
		return ResponseEntity.ok(usuarios);
	}
	
	/**
	 * metodo donde se crea parte de la url, para ser consumida en cualquier gestor
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	//metodo para poder utilizar get en la peticion
	@GetMapping("/deleteById/{usuacodi}")
	public ResponseEntity<Long> deleteById(@PathVariable("usuacodi") Integer usuacodi) throws Exception{
		Long result= 0L;
		//se carga el obejto de lo que devuelva el servicio
		usuariosRepository.deleteById(usuacodi);
		
		result = 1L;
		
		return ResponseEntity.ok(result);
	}
	
	/**
	 * metodo donde se crea parte de la url, para ser consumida en cualquier gestor
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	//metodo para poder utilizar get en la peticion
	@PostMapping("/createUser")
	public ResponseEntity<usuarios> createUser(@RequestBody usuarios entity) throws Exception{
		usuarios usuarios = usuariosRepository.save(entity);
		//se carga el obejto de lo que devuelva el servicio
		return ResponseEntity.ok(usuarios);
	}
	
	/**
	 * metodo donde se crea parte de la url, para ser consumida en cualquier gestor
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	//metodo para poder utilizar get en la peticion
	@PutMapping("/updateUser")
	public ResponseEntity<usuarios> updateUser(@RequestBody usuarios entity) throws Exception{
		usuarios usuarios = usuariosRepository.save(entity);
		//se carga el obejto de lo que devuelva el servicio
		return ResponseEntity.ok(usuarios);
	}
	
	
}
