
package Entity;

import Entity.Beteg_Adat;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kezelesi adatok")

public class KezAdat {
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idKezelesi_Adatok;
    
    @Column
    private LocalDate felvetel;
    
    @Column
    private LocalDate tavozas;
    
    @Column
    private int ivokura;
    
    @Column
    private int furdokura;
    
    @Column
    private int oxigen_kamra;
    
    @Column
    private int kemoterapia;
    
    @Column
    private int sugarterapia;
    
    @Column
    private int hormonterapia;
    

    public void setIdKezelesi_Adatok(int idKezelesi_Adatok) {
        this.idKezelesi_Adatok = idKezelesi_Adatok;
    }

    public void setFelvetel(LocalDate felvetel) {
        this.felvetel = felvetel;
    }

    public void setTavozas(LocalDate tavozas) {
        this.tavozas = tavozas;
    }

    public void setIvokura(int ivokura) {
        this.ivokura = ivokura;
    }

    public void setFurdokura(int furdokura) {
        this.furdokura = furdokura;
    }

    public void setOxigen_kamra(int oxigen_kamra) {
        this.oxigen_kamra = oxigen_kamra;
    }

    public void setKemoterapia(int kemoterapia) {
        this.kemoterapia = kemoterapia;
    }

    public void setSugarterapia(int sugarterapia) {
        this.sugarterapia = sugarterapia;
    }

    public void setHormonterapia(int hormonterapia) {
        this.hormonterapia = hormonterapia;
    }

    public int getIdKezelesi_Adatok() {
        return idKezelesi_Adatok;
    }

    public LocalDate getFelvetel() {
        return felvetel;
    }

    public LocalDate getTavozas() {
        return tavozas;
    }

    public int getIvokura() {
        return ivokura;
    }

    public int getFurdokura() {
        return furdokura;
    }

    public int getOxigen_kamra() {
        return oxigen_kamra;
    }

    public int getKemoterapia() {
        return kemoterapia;
    }

    public int getSugarterapia() {
        return sugarterapia;
    }

    public int getHormonterapia() {
        return hormonterapia;
    }
    
    public void setidBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    

}
