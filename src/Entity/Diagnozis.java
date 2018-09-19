
package Entity;

import Entity.Beteg_Adat;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Diagnózis")
public class Diagnozis {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat") //külső kulcs a táblában
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiagnozis;

    public int getIdDiagnózis() {
        return idDiagnozis;
    }

    public String getDiangozis1() {
        return Diangozis1;
    }

    public String getDiagnozis2() {
        return Diagnozis2;
    }

    public String getDiagnozis3() {
        return Diagnozis3;
    }

    public String getDiagnozis4() {
        return Diagnozis4;
    }

    public String getDiagnozis5() {
        return Diagnozis5;
    }

    public String getT() {
        return T;
    }

    public String getM() {
        return M;
    }

    public String getN() {
        return N;
    }
    

    public void setIdDiagnózis(int idDiagnózis) {
        this.idDiagnozis = idDiagnózis;
    }

    public void setDiangozis1(String Diangozis1) {
        this.Diangozis1 = Diangozis1;
    }

    public void setDiagnozis2(String Diagnozis2) {
        this.Diagnozis2 = Diagnozis2;
    }

    public void setDiagnozis3(String Diagnozis3) {
        this.Diagnozis3 = Diagnozis3;
    }

    public void setDiagnozis4(String Diagnozis4) {
        this.Diagnozis4 = Diagnozis4;
    }

    public void setDiagnozis5(String Diagnozis5) {
        this.Diagnozis5 = Diagnozis5;
    }

    public void setT(String T) {
        this.T = T;
    }

    public void setM(String M) {
        this.M = M;
    }

    public void setN(String N) {
        this.N = N;
    }

    @Override
    public String toString() {
        return "Diagnozis{" + "idDiagn\u00f3zis=" + idDiagnozis + ", Diang\u00f3zis1=" + Diangozis1 + ", Diagn\u00f3zis2=" + Diagnozis2 + ", Diagnz\u00f3is3=" + Diagnozis3 + ", Diagnz\u00f3is4=" + Diagnozis4 + ", Diagn\u00f3zis5=" + Diagnozis5 + ", T=" + T + ", M=" + M + ", N=" + N + '}';
    }
    
     public void setBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    
    @Column
    private String Diangozis1;
    
    @Column
    private String Diagnozis2;
    
    @Column
    private String Diagnozis3;
    
    @Column
    private String Diagnozis4;
   
    @Column
    private String Diagnozis5;
    
    @Column
    private String T;
    
    @Column
    private String M;
    
    @Column
    private String N;
    
    @Column
    private LocalDate adat_felvetel;

    public void setAdat_felvetel(LocalDate adat_felvetel) {
        this.adat_felvetel = adat_felvetel;
    }

    public LocalDate getAdat_felvetel() {
        return adat_felvetel;
    }

    public void setBeteg_Adat(Beteg_Adat beteg_Adat) {
        this.beteg_Adat = beteg_Adat;
    }

    public void setIdDiagnozis(int idDiagnozis) {
        this.idDiagnozis = idDiagnozis;
    }

    

    public Beteg_Adat getBeteg_Adat() {
        return beteg_Adat;
    }

    public int getIdDiagnozis() {
        return idDiagnozis;
    }

    
    
}
