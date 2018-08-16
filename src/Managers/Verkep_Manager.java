
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
}
