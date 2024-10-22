package com.hibernate.examen;

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
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        sesion.save(estud);
        tx.commit();
        System.out.println("Exito");
        
        Materia materia = new Materia();
        materia.setId_materia(0);;
        materia.setDescripcion("Hibernate");
                
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        sesion.save(materia);
        tx.commit();
        System.out.println("Exito");
        
        
    }
}
