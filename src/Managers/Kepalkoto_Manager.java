package Managers;


import Entity.Kepalkoto;
import Managers.Manager;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Kepalkoto_Manager extends Manager {
    List<Kepalkoto> kepalkoto = new ArrayList<>();
    public static void createKepalkoto(Kepalkoto kepalkoto){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(kepalkoto);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
            
        }
    }
    
    public static void updateKepalkoto(Kepalkoto kepalkoto){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(kepalkoto);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
