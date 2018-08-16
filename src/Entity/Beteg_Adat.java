
package Entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table (name = "beteg_adat")
public class Beteg_Adat {
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<Diagnozis> diag;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<Immun> immun;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<KezAdat> kezadat;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<KlinikaKemia> klinikaikemia;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<Kepalkoto> kepalkoto;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<VizsgalatiAdatok> vizsgalatiadatok;
    
    @OneToMany(mappedBy = "beteg_Adat", cascade = CascadeType.ALL)
    private List<Verkep> verkep; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public LocalDate getSzul_date() {
        return szul_date;
    }

    public String getEmail() {
        return email;
    }

    public String getLakcim() {
        return lakcim;
    }

    public String getNem() {
        return nem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzul_date(LocalDate szul_date) {
        this.szul_date = szul_date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }
    
    @Column
    private String nev;
    
    @Column
    private LocalDate szul_date;
    
    @Column
    private String email;
    
    @Column
    private String lakcim;

    @Override
    public String toString() {
        return "Beteg_Adat{" + "id=" + id + ", nev=" + nev + ", szul_date=" + szul_date + ", email=" + email + ", lakcim=" + lakcim + ", nem=" + nem + '}';
    }
    
    @Column
    private String nem;
}
