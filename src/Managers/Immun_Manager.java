
package Managers;

import Entity.Immun;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Immun_Manager extends Manager {
    List<Immun> immun = new ArrayList<>();
    
    public static void createImmun(Immun immun){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(immun);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        
    }
    
    public static void updateImmun(Immun immun){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(immun);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
     public static List<Immun> timeSortImmun(){
       SessionFactory factory = getSessionFactory();
       Session session = factory.getCurrentSession();
       List<Immun> immunok = new ArrayList<>();
       try {
           session.beginTransaction();
           session.createQuery("FROM immunstatusz im ORDER BY im.adat_felvetel DESC").getResultList();
           
           session.getTransaction().commit();
       } finally {
           session.close();
           factory.close();
       }
       return immunok;
   }
}
