package com.hibernate.model;

import java.io.Serializable;

public class EstudianteSim implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4843207239678933793L;
	private String c;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	public EstudianteSim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstudianteSim(String c, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.c = c;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
