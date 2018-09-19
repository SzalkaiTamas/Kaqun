
package Adat;

import Entity.VizsgalatiAdatok;
import Entity.Verkep;
import Entity.KlinikaKemia;
import Entity.KezAdat;
import Entity.Kepalkoto;
import Entity.Immun;
import Entity.Diagnozis;
import Entity.Beteg_Adat;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Adatok {
    public static void main(String[] args) {
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
        
       
        
        
    
}
}
