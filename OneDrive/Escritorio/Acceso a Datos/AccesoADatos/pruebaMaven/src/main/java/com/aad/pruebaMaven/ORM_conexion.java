package com.aad.pruebaMaven;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ORM_conexion {

  public static void main(String[] args) {

    try (Session s = HibernateUtil.getSessionFactory().openSession()) {
      Transaction t = null;
      
      try {
        t = s.beginTransaction();

        User user = new User();
        user.setId(1);
        user.setUserName("Paco");
        user.setUserMessage("Hello world from Pepe");
        s.save(user);
        
        Estudiante estudiante= new Estudiante();
        estudiante.setId(2);
        estudiante.setNombre("Paco");
        estudiante.setApellido("Arias");
        estudiante.setModulo("SMR");
        s.save(estudiante);

        
        Empleado empleado = new Empleado();
        empleado.setDni("71219222O");
        empleado.setNomEmp("javi");
        s.save(empleado);
        
        
        User user2 = new User();
        user2.setId(1);
        user2.setUserName("Pepe");
        user2.setUserMessage("Hello world from Pepe");
                s.save(user2);

        User user3 = new User();
        user3.setId(2);
        user3.setUserName("Juan");
        user3.setUserMessage("Hello world from Juan");
                s.save(user3);


    
        Estudiante estudiante2= new Estudiante();
        estudiante2.setId(2);
        estudiante2.setNombre("Paco");
        estudiante2.setApellido("Arias");
        estudiante2.setModulo("SMR");
        s.save(estudiante2);
   
        t.commit();

      } catch (Exception e) {
        e.printStackTrace(System.err);
        if (t != null) {
          t.rollback();
        }
      }
    }
  }
  
}