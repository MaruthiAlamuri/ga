package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Laptop;
import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stu =null;
        Laptop lap = new Laptop();
        lap.setLap_id(1);
        lap.setLap_name("hp");
        lap.setStu(stu);
        
        Laptop lap2 = new Laptop();
        lap2.setLap_id(2);
        lap2.setLap_name("dell");
        
         stu = new Student();
        stu.setStu_id(1);
        stu.setStu_name("puji");
        stu.getLaps().add(lap);
        stu.getLaps().add(lap2);
    	
    	
    	
    	Configuration config = new Configuration().configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session s = sf.openSession();
        Transaction tx =s.beginTransaction();
        s.save(lap);
        s.save(stu);
        s.save(lap2);
       
        tx.commit();
        
       
        System.out.println();
        sf.close();
       
    }
}
