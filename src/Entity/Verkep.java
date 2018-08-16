
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
@Table(name = "vérkép")
public class Verkep {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idverkep;

   
    @Column
    private double  feherversejt;
    
    @Column
    private double vorosversejt;
    
    @Column
    private double hemoglobin;
    
    @Column
    private double hematokrit;
    
    @Column
    private double mcv;
    
    @Column
    private double mch;
    
    @Column
    private double mchc;
    
    @Column
    private double trombocitaszam;
    
    @Column
    private double rdw_cv;
    
    @Column
    private double mpv;
    
    @Column
    private double neut;
    
    @Column
    private double lymph;
    
    @Column
    private double mono;
    
    @Column
    private double eo;
    
    @Column 
    private double baso;
    
    @Column
    private double luc;
    
    @Column
    private double neut_absz;
    
    @Column
    private double lymph_absz;
    
    @Column
    private double mono_absz;
    
    @Column
    private double eo_absz;
    
    @Column
    private double baso_absz;
    
    @Column
    private double luc_Absz;
    
    @Column
    private double vvt_sullyedes;

    public Beteg_Adat getBeteg_Adat() {
        return beteg_Adat;
    }

    public double getFeherversejt() {
        return feherversejt;
    }

    public double getVorosversejt() {
        return vorosversejt;
    }

    public double getHemoglobin() {
        return hemoglobin;
    }

    public double getHematokrit() {
        return hematokrit;
    }

    public double getMcv() {
        return mcv;
    }

    public double getMch() {
        return mch;
    }

    public double getMchc() {
        return mchc;
    }

    public double getTrombocitaszam() {
        return trombocitaszam;
    }

    public double getRdw_cv() {
        return rdw_cv;
    }

    public double getMpv() {
        return mpv;
    }

    public double getNeut() {
        return neut;
    }

    public double getLymph() {
        return lymph;
    }

    public double getMono() {
        return mono;
    }

    public double getEo() {
        return eo;
    }

    public double getBaso() {
        return baso;
    }

    public double getLuc() {
        return luc;
    }

    public double getNeut_absz() {
        return neut_absz;
    }

    public double getLymph_absz() {
        return lymph_absz;
    }

    public double getMono_absz() {
        return mono_absz;
    }

    public double getEo_absz() {
        return eo_absz;
    }
    

    public void setIdverkep(int idverkep) {
        this.idverkep = idverkep;
    }
    
     public void setBeteg_Adat(Beteg_Adat beteg_Adat) {
        this.beteg_Adat = beteg_Adat;
    }

    public void setFeherversejt(double feherversejt) {
        this.feherversejt = feherversejt;
    }

    public void setVorosversejt(double vorosversejt) {
        this.vorosversejt = vorosversejt;
    }

    public void setHemoglobin(double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public void setHematokrit(double hematokrit) {
        this.hematokrit = hematokrit;
    }

    public void setMcv(double mcv) {
        this.mcv = mcv;
    }

    public void setMch(double mch) {
        this.mch = mch;
    }

    public void setMchc(double mchc) {
        this.mchc = mchc;
    }

    public void setTrombocitaszam(double trombocitaszam) {
        this.trombocitaszam = trombocitaszam;
    }

    public void setRdw_cv(double rdw_cv) {
        this.rdw_cv = rdw_cv;
    }

    public void setMpv(double mpv) {
        this.mpv = mpv;
    }

    public void setNeut(double neut) {
        this.neut = neut;
    }

    public void setLymph(double lymph) {
        this.lymph = lymph;
    }

    public void setMono(double mono) {
        this.mono = mono;
    }

    public void setEo(double eo) {
        this.eo = eo;
    }

    public void setBaso(double baso) {
        this.baso = baso;
    }

    public void setLuc(double luc) {
        this.luc = luc;
    }

    public void setNeut_absz(double neut_absz) {
        this.neut_absz = neut_absz;
    }

    public void setLymph_absz(double lymph_absz) {
        this.lymph_absz = lymph_absz;
    }

    public void setMono_absz(double mono_absz) {
        this.mono_absz = mono_absz;
    }

    public void setEo_absz(double eo_absz) {
        this.eo_absz = eo_absz;
    }
    

    public void setBaso_absz(double baso_absz) {
        this.baso_absz = baso_absz;
    }

    public void setLuc_Absz(double luc_Absz) {
        this.luc_Absz = luc_Absz;
    }

    public void setVvtsullyedes(double vvtsullyedes) {
        this.vvt_sullyedes = vvtsullyedes;
    }

    public int getIdverkep() {
        return idverkep;
    }

    public double getBaso_absz() {
        return baso_absz;
    }

    public double getLuc_Absz() {
        return luc_Absz;
    }

    public double getVvtsullyedes() {
        return vvt_sullyedes;
    }
    
     public void setBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    
    
}
