
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
        
        Session session = factory.getCurrentSession();
        try {
            //betegek felvétele
            session.beginTransaction();
            Beteg_Adat betegAdat = new Beteg_Adat();
            betegAdat.setNev("asd");
            betegAdat.setEmail("asd@asd.hu");
            betegAdat.setNem("F");
            betegAdat.setLakcim("asd");
            betegAdat.setSzul_date(LocalDate.of(1965, Month.MARCH, 15));
            
            KezAdat kezAdat = new KezAdat();
            kezAdat.setFelvetel(LocalDate.of(2018, Month.MARCH, 05));
            kezAdat.setFurdokura(5);
            kezAdat.setHormonterapia(5);
            kezAdat.setIvokura(5);
            kezAdat.setKemoterapia(3);
            kezAdat.setOxigen_kamra(5);
            kezAdat.setSugarterapia(3);
            kezAdat.setTavozas(LocalDate.of(2018, Month.APRIL, 03));
            kezAdat.setidBetegAdat(betegAdat);
            
            session.save(betegAdat);
            session.save(kezAdat);
            session.getTransaction().commit();
            
           
            
        
        } finally {
            session.close();
            factory.close();
        }
        
        
    
}
}
