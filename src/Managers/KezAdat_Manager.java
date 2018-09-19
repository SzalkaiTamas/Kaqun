
package Managers;

import Entity.KezAdat;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class KezAdat_Manager extends Manager {
    List<KezAdat> kezadat = new ArrayList<>();
    
    public static void createKezAdat(KezAdat kezadat){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        
        try {
            session.beginTransaction();
            session.save(kezadat);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
    
    public static void updateKezAdat(KezAdat kezadat){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(kezadat);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
   public static List<KezAdat> timeSortKezAdat(){
       SessionFactory factory = getSessionFactory();
       Session session = factory.getCurrentSession();
       List<KezAdat> kezadatok = new ArrayList<>();
       try {
           session.beginTransaction();
           session.createQuery("FROM KezAdat ka ORDER BY ka.adat_felvetel DESC").getResultList();
           
           session.getTransaction().commit();
       } finally {
           session.close();
           factory.close();
       }
       return kezadatok;
   }
    
}
