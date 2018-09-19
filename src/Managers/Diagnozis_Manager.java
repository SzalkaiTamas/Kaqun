
package Managers;

import Entity.Diagnozis;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Diagnozis_Manager extends Manager {
    List<Diagnozis> diagnozis = new ArrayList<>();
    
    public static void createDiangozis(Diagnozis diagnozis){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        
        try {
            session.beginTransaction();
            session.save(diagnozis);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
    
    public static void updateDiagnozis(Diagnozis diagnozis){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(diagnozis);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
    
}
