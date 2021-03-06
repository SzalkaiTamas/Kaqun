
package Managers;

import Entity.Verkep;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Verkep_Manager extends Manager{
    List<Verkep> verkep = new ArrayList<>();
    public static void createVerkep(Verkep verkep){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(verkep);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        
    }
    
    public static void updateVerkep(Verkep verkep){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(verkep);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
     public static List<Verkep> timeSortVerkep(){
       SessionFactory factory = getSessionFactory();
       Session session = factory.getCurrentSession();
       List<Verkep> verkepek = new ArrayList<>();
       try {
           session.beginTransaction();
           session.createQuery("FROM verkep ve ORDER BY ve.adat_felvetel DESC").getResultList();
           
           session.getTransaction().commit();
       } finally {
           session.close();
           factory.close();
       }
       return verkepek;
   }
}
