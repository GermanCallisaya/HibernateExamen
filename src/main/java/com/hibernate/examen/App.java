package com.hibernate.examen;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.model.Estudiante;
import com.hibernate.model.Materia;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Estudiante estud = new Estudiante();
        estud.setC("b");
        estud.setApellidoPaterno("Callisaya");
        estud.setApellidoMaterno("Gutierrez");
        estud.setNombre("Miguel");
        Transaction tx =null;
        
        System.out.println("Estudiante ingresado con exito.");
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        sesion.save(estud);
        tx.commit();
        System.out.println("Exito");
        tx = sesion.beginTransaction();
        List estudiantes = sesion.createQuery("FROM Estudiante").list();
        for(Iterator iterator = estudiantes.iterator();iterator.hasNext(); ) {
        	Estudiante e = (Estudiante) iterator.next();
        	
        	System.out.println(String.format("Codigo: %s, Nombre: ,%s Apellido: %s", e.getC(),e.getNombre(), e.getApellidoPaterno()));
        	
        }
        
        
        
        tx.commit();
     
        
    }
    
    
    private static void mostrarRegistro() {
    	Transaction tx = null;
    	Session sesion = HibernateUtil.getSessionFactory().openSession();
    	tx = sesion.beginTransaction();
    	String hql = "From Estudiante as ES where ES.nombre='German'";
    	Query consulta = sesion.createQuery(hql);
    	
    	List Estudiantes = consulta.getResultList();
    	
    	for (Iterator iterator = Estudiantes.iterator();iterator.hasNext();) {
    		com.hibernate.model.EstudianteSim e = (com.hibernate.model.EstudianteSim) iterator.next();
    		System.out.println(String.format("Codigo: %s, Nombre: ,%s Apellido: %s", e.getC(),e.getNombre(), e.getApellidoPaterno()));
    	}
    	
    }
    
    private static void mostrar() {
    	Transaction tx = null;
    	Session sesion = HibernateUtil.getSessionFactory().openSession();
    	tx = sesion.beginTransaction();
    	String hql = "From EstudianteMateria as ESM where calificaciones between 80 and 90 ";
    	Query consulta = sesion.createQuery(hql);
    	
    	List EstudiantesMaterias = consulta.getResultList();
    	
    	for (Iterator iterator = EstudiantesMaterias.iterator();iterator.hasNext();) {
    		com.hibernate.model.EstudianteMateria e = (com.hibernate.model.EstudianteMateria) iterator.next();
    		System.out.println(String.format("Materia: %s, Nombre: ,%s Calificacion: %s", e.getId_materia(),e.getId_estudiante(), e.getCalificacion()));
    	}
    	
    }
    
    
}
