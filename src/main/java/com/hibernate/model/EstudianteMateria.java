package com.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="estudiantemateria",schema="public")
public class EstudianteMateria {
	private int id_materia;
	private int id_estudiante;
	private int calificacion;
	


	public EstudianteMateria(int id_materia, int id_estudiante, int calificacion) {
		super();
		this.id_materia = id_materia;
		this.id_estudiante = id_estudiante;
		this.calificacion = calificacion;
	}

	public EstudianteMateria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
}
