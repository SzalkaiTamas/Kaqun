
package Entity;

import Entity.Beteg_Adat;
import java.time.LocalDate;
import java.util.Date;
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
@Table(name = "képalkotó")
public class Kepalkoto {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idKepalkoto;
    
    @Column
    private String kepalkoto_ct;
    
    @Column
    private String kepalkoto_petct;
    
    @Column
    private String kepalkoto_ultrahang;
    
    @Column
    private String mri;
    
    @Column
    private LocalDate adat_felvetel;

    public void setAdat_felvetel(LocalDate adat_felvetel) {
        this.adat_felvetel = adat_felvetel;
    }

    public LocalDate getAdat_felvetel() {
        return adat_felvetel;
    }

    public void setKepalkoto_ct(String kepalkoto_ct) {
        this.kepalkoto_ct = kepalkoto_ct;
    }

   

    public String getKepalkoto_ct() {
        return kepalkoto_ct;
    }

    

    public void setBeteg_Adat(Beteg_Adat beteg_Adat) {
        this.beteg_Adat = beteg_Adat;
    }

    public void setKepalkoto_petct(String kepalkoto_petct) {
        this.kepalkoto_petct = kepalkoto_petct;
    }

    public void setKepalkoto_ultrahang(String kepalkoto_ultrahang) {
        this.kepalkoto_ultrahang = kepalkoto_ultrahang;
    }

    public void setMri(String mri) {
        this.mri = mri;
    }

    public Beteg_Adat getBeteg_Adat() {
        return beteg_Adat;
    }

    public String getKepalkoto_petct() {
        return kepalkoto_petct;
    }

    public String getKepalkoto_ultrahang() {
        return kepalkoto_ultrahang;
    }

    public String getMri() {
        return mri;
    }

    public int getIdKepalkoto() {
        return idKepalkoto;
    }

    public String getKepalkoto() {
        return kepalkoto_ct;
    }

    public void setIdKepalkoto(int idKepalkoto) {
        this.idKepalkoto = idKepalkoto;
    }

    public void setKepalkoto(String kepalkoto) {
        this.kepalkoto_ct = kepalkoto;
    }
    
     public void setBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    
}
