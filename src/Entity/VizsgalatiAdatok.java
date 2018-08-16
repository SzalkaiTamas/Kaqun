
package Entity;

import Entity.Beteg_Adat;
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
@Table(name = "vizsgálati adatok")
public class VizsgalatiAdatok {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idvizsgalati_adatok;
    
    @Column
    private int rr;
    
    @Column
    private String megjegyzes;

    public void setIdvizsgalati_adatok(int idvizsgalati_adatok) {
        this.idvizsgalati_adatok = idvizsgalati_adatok;
    }

    public void setRr(int rr) {
        this.rr = rr;
    }

    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    public int getIdvizsgalati_adatok() {
        return idvizsgalati_adatok;
    }

    public int getRr() {
        return rr;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }
    
     public void setBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    
}
