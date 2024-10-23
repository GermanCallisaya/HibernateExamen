package com.hibernate.examen;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
        estud.setNombre("German");
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
    	
    	
    }
    
    
    
}
