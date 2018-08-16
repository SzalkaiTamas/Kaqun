
package Managers;

import Entity.Beteg_Adat;
import Entity.Diagnozis;
import Entity.Immun;
import Entity.Kepalkoto;
import Entity.KezAdat;
import Entity.KlinikaKemia;
import Entity.Verkep;
import Entity.VizsgalatiAdatok;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Manager {
     public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration() 
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Beteg_Adat.class)
        .addAnnotatedClass(Diagnozis.class)
        .addAnnotatedClass(Immun.class)
        .addAnnotatedClass(KezAdat.class)
        .addAnnotatedClass(KlinikaKemia.class)
        .addAnnotatedClass(Kepalkoto.class)
        .addAnnotatedClass(VizsgalatiAdatok.class)
        .addAnnotatedClass(Verkep.class)
        .buildSessionFactory();
        
        return factory;
      
}
}
     
   
