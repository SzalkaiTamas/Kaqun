
package Managers;

import Entity.VizsgalatiAdatok;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VizsgalatiAdatok_Manager extends Manager {
    List<VizsgalatiAdatok> vizsgalatiadatok = new ArrayList<>();
    
    public static void createVizsgalatiAdatok(VizsgalatiAdatok vizsgalatiadatok){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        
        try {
            session.beginTransaction();
            session.save(vizsgalatiadatok);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
    
    public static void updateVizsgalatiAdatok(VizsgalatiAdatok vizsgalatiAdatok){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(vizsgalatiAdatok);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
     public static List<VizsgalatiAdatok> timeSortVizsgalataiAdatok(){
       SessionFactory factory = getSessionFactory();
       Session session = factory.getCurrentSession();
       List<VizsgalatiAdatok> vizsgalati_adatok = new ArrayList<>();
       try {
           session.beginTransaction();
           session.createQuery("FROM vizsgalati_adatok va ORDER BY va.adat_felvetel DESC").getResultList();
           
           session.getTransaction().commit();
       } finally {
           session.close();
           factory.close();
       }
       return vizsgalati_adatok;
   }
    
}
