
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
@Table(name = "immunstátusz")
public class Immun {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @Column(name = "idImmunstátusz")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idImmunstatusz;
    
    @Column
    private double t_sejt_limfocitak;
    
    @Column
    private double b_sejt_limfocitak;
    
    @Column
    private double nk_sejt_limfocitak;
    
    @Column
    private double CD4_helpert_limfocitak;
    
    @Column
    private double CD8_citotoxikus_T_sejt_limfocitak;
    
    @Column
    private double Aktivalt_T_sejtek_HLA_DR_CD3;
    
    @Column
    private double NK_tipusu_sejtek_CD3_CD8_CD56;
    
    @Column
    private double CD4_CD8_arany;
    
    @Column
    private double NK_funkcio;
    
    @Column
    private double Citotoxicitasi_index;
    
    @Column
    private double NK_funkció_szamitott;
    
    @Column
    private double C_vitamin;
    
    @Column
    private double HIF_1_alfa;
    
    @Column
    private double Hla_dr_cd3_limfocitakon_belul;
    
    @Column
    private double CD3_CD8_CD56_limfocitakon_belul;
    
    @Column
    private LocalDate adat_felvetel;

    public void setAdat_felvetel(LocalDate adat_felvetel) {
        this.adat_felvetel = adat_felvetel;
    }

    public LocalDate getAdat_felvetel() {
        return adat_felvetel;
    }

    public void setNK_funkcio(double NK_funkcio) {
        this.NK_funkcio = NK_funkcio;
    }

   
    public double getNK_funkcio() {
        return NK_funkcio;
    }

  

    public void setCD3_CD8_CD56_limfocitakon_belul(double CD3_CD8_CD56_limfocitakon_belul) {
        this.CD3_CD8_CD56_limfocitakon_belul = CD3_CD8_CD56_limfocitakon_belul;
    }

    public double getCD3_CD8_CD56_limfocitakon_belul() {
        return CD3_CD8_CD56_limfocitakon_belul;
    }

    public void setHla_dr_cd3_limfocitakon_belul(double Hla_dr_cd3_limfocitakon_belul) {
        this.Hla_dr_cd3_limfocitakon_belul = Hla_dr_cd3_limfocitakon_belul;
    }

    public double getHla_dr_cd3_limfocitakon_belul() {
        return Hla_dr_cd3_limfocitakon_belul;
    }

    public void setBeteg_Adat(Beteg_Adat beteg_Adat) {
        this.beteg_Adat = beteg_Adat;
    }

    public void setIdImmunstatusz(int idImmunstatusz) {
        this.idImmunstatusz = idImmunstatusz;
    }

    public void setT_sejt_limfocitak(double t_sejt_limfocitak) {
        this.t_sejt_limfocitak = t_sejt_limfocitak;
    }

    public void setB_sejt_limfocitak(double b_sejt_limfocitak) {
        this.b_sejt_limfocitak = b_sejt_limfocitak;
    }

    public void setNk_sejt_limfocitak(double nk_sejt_limfocitak) {
        this.nk_sejt_limfocitak = nk_sejt_limfocitak;
    }

    public void setCD4_helpert_limfocitak(double CD4_helpert_limfocitak) {
        this.CD4_helpert_limfocitak = CD4_helpert_limfocitak;
    }

    public void setCD8_citotoxikus_T_sejt_limfocitak(double CD8_citotoxikus_T_sejt_limfocitak) {
        this.CD8_citotoxikus_T_sejt_limfocitak = CD8_citotoxikus_T_sejt_limfocitak;
    }

    public void setAktivalt_T_sejtek_HLA_DR_CD3(double Aktivalt_T_sejtek_HLA_DR_CD3) {
        this.Aktivalt_T_sejtek_HLA_DR_CD3 = Aktivalt_T_sejtek_HLA_DR_CD3;
    }

    public void setNK_tipusu_sejtek_CD3_CD8_CD56(double NK_tipusu_sejtek_CD3_CD8_CD56) {
        this.NK_tipusu_sejtek_CD3_CD8_CD56 = NK_tipusu_sejtek_CD3_CD8_CD56;
    }

    public void setCD4_CD8_arany(double CD4_CD8_arany) {
        this.CD4_CD8_arany = CD4_CD8_arany;
    }

    public void setMK_funkcio(double MK_funkcio) {
        this.NK_funkcio = MK_funkcio;
    }

    public void setCitotoxicitasi_index(double Citotoxicitasi_index) {
        this.Citotoxicitasi_index = Citotoxicitasi_index;
    }

    public void setNK_funkció_szamitott(double NK_funkció_szamitott) {
        this.NK_funkció_szamitott = NK_funkció_szamitott;
    }

    public void setC_vitamin(double C_vitamin) {
        this.C_vitamin = C_vitamin;
    }

    public void setHIF_1_alfa(double HIF_1_alfa) {
        this.HIF_1_alfa = HIF_1_alfa;
    }

    public Beteg_Adat getBeteg_Adat() {
        return beteg_Adat;
    }

    public int getIdImmunstatusz() {
        return idImmunstatusz;
    }

    public double getT_sejt_limfocitak() {
        return t_sejt_limfocitak;
    }

    public double getB_sejt_limfocitak() {
        return b_sejt_limfocitak;
    }

    public double getNk_sejt_limfocitak() {
        return nk_sejt_limfocitak;
    }

    public double getCD4_helpert_limfocitak() {
        return CD4_helpert_limfocitak;
    }

    public double getCD8_citotoxikus_T_sejt_limfocitak() {
        return CD8_citotoxikus_T_sejt_limfocitak;
    }

    public double getAktivalt_T_sejtek_HLA_DR_CD3() {
        return Aktivalt_T_sejtek_HLA_DR_CD3;
    }

    public double getNK_tipusu_sejtek_CD3_CD8_CD56() {
        return NK_tipusu_sejtek_CD3_CD8_CD56;
    }

    public double getCD4_CD8_arany() {
        return CD4_CD8_arany;
    }

    public double getMK_funkcio() {
        return NK_funkcio;
    }

    public double getCitotoxicitasi_index() {
        return Citotoxicitasi_index;
    }

    public double getNK_funkció_szamitott() {
        return NK_funkció_szamitott;
    }

    public double getC_vitamin() {
        return C_vitamin;
    }

    public double getHIF_1_alfa() {
        return HIF_1_alfa;
    }

   
}
