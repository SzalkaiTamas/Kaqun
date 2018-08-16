
package Managers;

import Entity.Beteg_Adat;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Beteg_Adat_Manager extends Manager {
    
    
    public static List<Beteg_Adat> listAll(){
        List<Beteg_Adat> betegAdatok = new ArrayList<>();
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            betegAdatok = session.createQuery("FROM Beteg_Adat").getResultList();
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        return betegAdatok;
    }
    
    public static void createBetegAdat(Beteg_Adat beteg_Adat){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(beteg_Adat);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
    
    public static List<Beteg_Adat> ListByName(String nev){
        List<Beteg_Adat> beteg_Adatok = new ArrayList<>();
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            beteg_Adatok = session.createQuery("FROM Beteg_Adat ba WHERE ba.nev LIKE '%" + nev + "%'").getResultList();
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
        return beteg_Adatok;
    }
    
    public static void delete(List<Integer> Ids){
        SessionFactory factory = getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            Query q  = session.createQuery("DELETE FROM Beteg_Adat ba WHERE ba.id IN (:list)");
            q.setParameterList("list", Ids);
            q.executeUpdate();
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
