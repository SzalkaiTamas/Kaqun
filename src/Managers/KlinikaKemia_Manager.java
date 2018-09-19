
package Managers;

import Entity.KlinikaKemia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class KlinikaKemia_Manager extends Manager {
    List<KlinikaKemia> klinikakemia = new ArrayList<>();
    
    public static void createKlinikakemia(KlinikaKemia klinikakemia){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        
        try {
            session.beginTransaction();
            session.save(klinikakemia);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
    
    public static void updateKlinikaKemia(KlinikaKemia klinikakemia){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(klinikakemia);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
     public static List<KlinikaKemia> timeSortKlinikaKemia(){
       SessionFactory factory = getSessionFactory();
       Session session = factory.getCurrentSession();
       List<KlinikaKemia> klinikakemiai = new ArrayList<>();
       try {
           session.beginTransaction();
           session.createQuery("FROM klinika_kemia kk ORDER BY kk.adat_felvetel DESC").getResultList();
           
           session.getTransaction().commit();
       } finally {
           session.close();
           factory.close();
       }
       return klinikakemiai;
   }
}
