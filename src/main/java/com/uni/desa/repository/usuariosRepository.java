package com.uni.desa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uni.desa.domain.usuarios;

@Repository
public interface usuariosRepository extends JpaRepository<usuarios, Integer> {

}
