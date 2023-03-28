package com.uni.desa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class usuarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long usuacodi;
	private String usuanomb;
	private Long usuaedad;
	private String usuaemail;
	private String usuadire;
	private String usuatele;
	public Long getUsuacodi() {
		return usuacodi;
	}
	public void setUsuacodi(Long usuacodi) {
		this.usuacodi = usuacodi;
	}
	public String getUsuanomb() {
		return usuanomb;
	}
	public void setUsuanomb(String usuanomb) {
		this.usuanomb = usuanomb;
	}
	public Long getUsuaedad() {
		return usuaedad;
	}
	public void setUsuaedad(Long usuaedad) {
		this.usuaedad = usuaedad;
	}
	public String getUsuaemail() {
		return usuaemail;
	}
	public void setUsuaemail(String usuaemail) {
		this.usuaemail = usuaemail;
	}
	public String getUsuadire() {
		return usuadire;
	}
	public void setUsuadire(String usuadire) {
		this.usuadire = usuadire;
	}
	public String getUsuatele() {
		return usuatele;
	}
	public void setUsuatele(String usuatele) {
		this.usuatele = usuatele;
	}

	
}
