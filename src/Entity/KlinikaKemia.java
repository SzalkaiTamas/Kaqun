
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
import org.hibernate.annotations.Generated;

@Entity
@Table(name = "klinikai kémiai")

public class KlinikaKemia {
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "idBetegAdat")
    private Beteg_Adat beteg_Adat;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idklinikai_kemiai;
    
    @Column
    private double hugysav;
    
    @Column
    private double kalium;
    
    @Column
    private double osszfeherje;
    
    @Column
    private double albumin;
    
    @Column
    private double klinikai_kemiaicol;
    
    @Column
    private double crp;
    
    @Column
    private double vas;
    
    @Column
    private double transzferrin;
    
    @Column
    private double koleszterin;
    
    @Column
    private double triglicerin;
    
    @Column
    private double hdl_kis_koleszterin;
    
    @Column
    private double eldl_koleszterin;
    
    @Column
    private double osszbilirubin;
    
    @Column
    private double got;
    
    @Column
    private double gpt;
    
    @Column
    private double ggt;
    
    @Column
    private double alkalikus_foszfataz;
    
    @Column
    private double csontspecifikus_ap;
    
    @Column
    private double ldh;
    
    @Column
    private double ck;
    
    @Column
    private double alfa_amiláz;
    
    @Column
    private double lipaz;
    
    @Column
    private double ft4;
    
    @Column
    private double ft3;
    
    @Column
    private double tsh;
    
    @Column
    private double thyreoglobulin;
    
    @Column
    private double d_vitamin;
    
    @Column
    private double parathormon;
    
    @Column
    private double anti_mullerian_hormon;
    
    @Column
    private double fsh;
    
    @Column
    private double lh;
    
    @Column
    private double prolaktin;
    
    @Column
    private double ossztradiol;
    
    @Column
    private double progeszteron;
    
    @Column
    private double totaltesztoszteron;
    
    @Column
    private double aldoszteron;
    
    @Column
    private double kortizol;
    
    @Column
    private double homa_index;
    
    @Column
    private double igf_1;
    
    @Column
    private double inzulin;
    
    @Column
    private double inzulin_reziztencia;
    
    @Column
    private double ca_125;
    
    @Column
    private double he4;
    
    @Column
    private double ca15_3;
    
    @Column
    private double ca72_4;
    
    @Column
    private double ca19_9;
    
    @Column
    private double afp;
    
    @Column
    private double cea;
    
    @Column
    private double psa;
    
    @Column
    private double fpsa;
    
    @Column
    private double pro_psa;
    
    @Column
    private double nse;
    
    @Column
    private double s100_protein;
    
    @Column
    private double tpa;
    
    @Column
    private double m2_pk_marker;
    
    @Column
    private double reumafaktor;
    
    @Column
    private double coliakiaszures;
    
    @Column
    private double anti_tpo;
    
    @Column
    private double thyreoglobulin_autoat;
    
    @Column
    private double tsh_receptor_autoat;
    
    @Column
    private double feherje_elfo;
    
    @Column
    private double elfo_parapot;
    
    @Column
    private double ast;
    
    @Column
    private double inmunglobuliun_a;
    
    @Column
    private double inmunglobulin_g;
    
    @Column
    private double inmunglobulin_m;
    
    @Column
    private double igg_alosztalyok;
    
    @Column
    private double glukoz;

    public void setBeteg_Adat(Beteg_Adat beteg_Adat) {
        this.beteg_Adat = beteg_Adat;
    }

    public void setOsszbilirubin(double osszbilirubin) {
        this.osszbilirubin = osszbilirubin;
    }

    public void setGot(double got) {
        this.got = got;
    }

    public void setGpt(double gpt) {
        this.gpt = gpt;
    }

    public void setGgt(double ggt) {
        this.ggt = ggt;
    }

    public void setAlkalikus_foszfataz(double alkalikus_foszfataz) {
        this.alkalikus_foszfataz = alkalikus_foszfataz;
    }

    public void setCsontspecifikus_ap(double csontspecifikus_ap) {
        this.csontspecifikus_ap = csontspecifikus_ap;
    }

    public void setLdh(double ldh) {
        this.ldh = ldh;
    }

    public void setCk(double ck) {
        this.ck = ck;
    }

    public void setAlfa_amiláz(double alfa_amiláz) {
        this.alfa_amiláz = alfa_amiláz;
    }

    public void setLipaz(double lipaz) {
        this.lipaz = lipaz;
    }

    public void setFt4(double ft4) {
        this.ft4 = ft4;
    }

    public void setFt3(double ft3) {
        this.ft3 = ft3;
    }

    public void setTsh(double tsh) {
        this.tsh = tsh;
    }

    public void setThyreoglobulin(double thyreoglobulin) {
        this.thyreoglobulin = thyreoglobulin;
    }

    public void setD_vitamin(double d_vitamin) {
        this.d_vitamin = d_vitamin;
    }

    public void setParathormon(double parathormon) {
        this.parathormon = parathormon;
    }

    public void setAnti_mullerian_hormon(double anti_mullerian_hormon) {
        this.anti_mullerian_hormon = anti_mullerian_hormon;
    }

    public void setFsh(double fsh) {
        this.fsh = fsh;
    }

    public void setLh(double lh) {
        this.lh = lh;
    }

    public void setProlaktin(double prolaktin) {
        this.prolaktin = prolaktin;
    }

    public void setOssztradiol(double ossztradiol) {
        this.ossztradiol = ossztradiol;
    }

    public void setProgeszteron(double progeszteron) {
        this.progeszteron = progeszteron;
    }

    public void setTotaltesztoszteron(double totaltesztoszteron) {
        this.totaltesztoszteron = totaltesztoszteron;
    }

    public void setAldoszteron(double aldoszteron) {
        this.aldoszteron = aldoszteron;
    }

    public void setKortizol(double kortizol) {
        this.kortizol = kortizol;
    }

    public void setHoma_index(double homa_index) {
        this.homa_index = homa_index;
    }

    public void setIgf_1(double igf_1) {
        this.igf_1 = igf_1;
    }

    public void setInzulin(double inzulin) {
        this.inzulin = inzulin;
    }

    public void setInzulin_reziztencia(double inzulin_reziztencia) {
        this.inzulin_reziztencia = inzulin_reziztencia;
    }

    public void setCa_125(double ca_125) {
        this.ca_125 = ca_125;
    }

    public void setHe4(double he4) {
        this.he4 = he4;
    }

    public void setCa15_3(double ca15_3) {
        this.ca15_3 = ca15_3;
    }

    public void setCa72_4(double ca72_4) {
        this.ca72_4 = ca72_4;
    }

    public void setCa19_9(double ca19_9) {
        this.ca19_9 = ca19_9;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public void setCea(double cea) {
        this.cea = cea;
    }

    public void setPsa(double psa) {
        this.psa = psa;
    }

    public void setFpsa(double fpsa) {
        this.fpsa = fpsa;
    }

    public void setPro_psa(double pro_psa) {
        this.pro_psa = pro_psa;
    }

    public void setNse(double nse) {
        this.nse = nse;
    }

    public void setS100_protein(double s100_protein) {
        this.s100_protein = s100_protein;
    }

    public void setTpa(double tpa) {
        this.tpa = tpa;
    }

    public void setM2_pk_marker(double m2_pk_marker) {
        this.m2_pk_marker = m2_pk_marker;
    }

    public void setReumafaktor(double reumafaktor) {
        this.reumafaktor = reumafaktor;
    }

    public void setColiakiaszures(double coliakiaszures) {
        this.coliakiaszures = coliakiaszures;
    }

    public void setAnti_tpo(double anti_tpo) {
        this.anti_tpo = anti_tpo;
    }

    public void setThyreoglobulin_autoat(double thyreoglobulin_autoat) {
        this.thyreoglobulin_autoat = thyreoglobulin_autoat;
    }

    public void setTsh_receptor_autoat(double tsh_receptor_autoat) {
        this.tsh_receptor_autoat = tsh_receptor_autoat;
    }

    public void setFeherje_elfo(double feherje_elfo) {
        this.feherje_elfo = feherje_elfo;
    }

    public void setElfo_parapot(double elfo_parapot) {
        this.elfo_parapot = elfo_parapot;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public void setInmunglobuliun_a(double inmunglobuliun_a) {
        this.inmunglobuliun_a = inmunglobuliun_a;
    }

    public void setInmunglobulin_g(double inmunglobulin_g) {
        this.inmunglobulin_g = inmunglobulin_g;
    }

    public void setInmunglobulin_m(double inmunglobulin_m) {
        this.inmunglobulin_m = inmunglobulin_m;
    }

    public void setIgg_alosztalyok(double igg_alosztalyok) {
        this.igg_alosztalyok = igg_alosztalyok;
    }

    public Beteg_Adat getBeteg_Adat() {
        return beteg_Adat;
    }

    public double getHugysav() {
        return hugysav;
    }

    public double getKalium() {
        return kalium;
    }

    public double getOsszfeherje() {
        return osszfeherje;
    }

    public double getAlbumin() {
        return albumin;
    }

    public double getKlinikai_kemiaicol() {
        return klinikai_kemiaicol;
    }

    public double getCrp() {
        return crp;
    }

    public double getVas() {
        return vas;
    }

    public double getTranszferrin() {
        return transzferrin;
    }

    public double getKoleszterin() {
        return koleszterin;
    }

    public double getTriglicerin() {
        return triglicerin;
    }

    public double getHdl_kis_koleszterin() {
        return hdl_kis_koleszterin;
    }

    public double getEldl_koleszterin() {
        return eldl_koleszterin;
    }

    public double getOsszbilirubin() {
        return osszbilirubin;
    }

    public double getGot() {
        return got;
    }

    public double getGpt() {
        return gpt;
    }

    public double getGgt() {
        return ggt;
    }

    public double getAlkalikus_foszfataz() {
        return alkalikus_foszfataz;
    }

    public double getCsontspecifikus_ap() {
        return csontspecifikus_ap;
    }

    public double getLdh() {
        return ldh;
    }

    public double getCk() {
        return ck;
    }

    public double getAlfa_amiláz() {
        return alfa_amiláz;
    }

    public double getLipaz() {
        return lipaz;
    }

    public double getFt4() {
        return ft4;
    }

    public double getFt3() {
        return ft3;
    }

    public double getTsh() {
        return tsh;
    }

    public double getThyreoglobulin() {
        return thyreoglobulin;
    }

    public double getD_vitamin() {
        return d_vitamin;
    }

    public double getParathormon() {
        return parathormon;
    }

    public double getAnti_mullerian_hormon() {
        return anti_mullerian_hormon;
    }

    public double getFsh() {
        return fsh;
    }

    public double getLh() {
        return lh;
    }

    public double getProlaktin() {
        return prolaktin;
    }

    public double getOssztradiol() {
        return ossztradiol;
    }

    public double getProgeszteron() {
        return progeszteron;
    }

    public double getTotaltesztoszteron() {
        return totaltesztoszteron;
    }

    public double getAldoszteron() {
        return aldoszteron;
    }

    public double getKortizol() {
        return kortizol;
    }

    public double getHoma_index() {
        return homa_index;
    }

    public double getIgf_1() {
        return igf_1;
    }

    public double getInzulin() {
        return inzulin;
    }

    public double getInzulin_reziztencia() {
        return inzulin_reziztencia;
    }

    public double getCa_125() {
        return ca_125;
    }

    public double getHe4() {
        return he4;
    }

    public double getCa15_3() {
        return ca15_3;
    }

    public double getCa72_4() {
        return ca72_4;
    }

    public double getCa19_9() {
        return ca19_9;
    }

    public double getAfp() {
        return afp;
    }

    public double getCea() {
        return cea;
    }

    public double getPsa() {
        return psa;
    }

    public double getFpsa() {
        return fpsa;
    }

    public double getPro_psa() {
        return pro_psa;
    }

    public double getNse() {
        return nse;
    }

    public double getS100_protein() {
        return s100_protein;
    }

    public double getTpa() {
        return tpa;
    }

    public double getM2_pk_marker() {
        return m2_pk_marker;
    }

    public double getReumafaktor() {
        return reumafaktor;
    }

    public double getColiakiaszures() {
        return coliakiaszures;
    }

    public double getAnti_tpo() {
        return anti_tpo;
    }

    public double getThyreoglobulin_autoat() {
        return thyreoglobulin_autoat;
    }

    public double getTsh_receptor_autoat() {
        return tsh_receptor_autoat;
    }

    public double getFeherje_elfo() {
        return feherje_elfo;
    }

    public double getElfo_parapot() {
        return elfo_parapot;
    }

    public double getAst() {
        return ast;
    }

    public double getInmunglobuliun_a() {
        return inmunglobuliun_a;
    }

    public double getInmunglobulin_g() {
        return inmunglobulin_g;
    }

    public double getInmunglobulin_m() {
        return inmunglobulin_m;
    }

    public double getIgg_alosztalyok() {
        return igg_alosztalyok;
    }

    public void setGlukoz(double glukoz) {
        this.glukoz = glukoz;
    }

    public double getGlukoz() {
        return glukoz;
    }

    public void setIdklinikai_kemiai(int idklinikai_kemiai) {
        this.idklinikai_kemiai = idklinikai_kemiai;
    }

    public void setHugysav(double hugysav) {
        this.hugysav = hugysav;
    }

    public void setKalium(double kalium) {
        this.kalium = kalium;
    }

    public void setOsszfeherje(double osszfeherje) {
        this.osszfeherje = osszfeherje;
    }

    public void setAlbumin(double albumin) {
        this.albumin = albumin;
    }

    public void setKlinikai_kemiaicol(double klinikai_kemiaicol) {
        this.klinikai_kemiaicol = klinikai_kemiaicol;
    }

    public void setCrp(double crp) {
        this.crp = crp;
    }

    public void setVas(double vas) {
        this.vas = vas;
    }

    public void setTranszferrin(double transzferrin) {
        this.transzferrin = transzferrin;
    }

    public void setKoleszterin(double koleszterin) {
        this.koleszterin = koleszterin;
    }

    public void setTriglicerin(double triglicerin) {
        this.triglicerin = triglicerin;
    }

    public void setHdl_kis_koleszterin(double hdl_kis_koleszterin) {
        this.hdl_kis_koleszterin = hdl_kis_koleszterin;
    }

    public void setEldl_koleszterin(double eldl_koleszterin) {
        this.eldl_koleszterin = eldl_koleszterin;
    }

    public void setOsszbilirubin(int osszbilirubin) {
        this.osszbilirubin = osszbilirubin;
    }

    public void setGot(int got) {
        this.got = got;
    }

    public void setGpt(int gpt) {
        this.gpt = gpt;
    }

    public void setGgt(int ggt) {
        this.ggt = ggt;
    }

    public void setAlkalikus_foszfataz(int alkalikus_foszfataz) {
        this.alkalikus_foszfataz = alkalikus_foszfataz;
    }

    public void setCsontspecifikus_ap(int csontspecifikus_ap) {
        this.csontspecifikus_ap = csontspecifikus_ap;
    }

    public void setLdh(int ldh) {
        this.ldh = ldh;
    }

    public void setCk(int ck) {
        this.ck = ck;
    }

    public void setAlfa_amiláz(int alfa_amiláz) {
        this.alfa_amiláz = alfa_amiláz;
    }

    public void setLipaz(int lipaz) {
        this.lipaz = lipaz;
    }

    public void setFt4(int ft4) {
        this.ft4 = ft4;
    }

    public void setFt3(int ft3) {
        this.ft3 = ft3;
    }

    public void setTsh(int tsh) {
        this.tsh = tsh;
    }

    public void setThyreoglobulin(int thyreoglobulin) {
        this.thyreoglobulin = thyreoglobulin;
    }

    public void setD_vitamin(int d_vitamin) {
        this.d_vitamin = d_vitamin;
    }

    public void setParathormon(int parathormon) {
        this.parathormon = parathormon;
    }

    public void setAnti_mullerian_hormon(int anti_mullerian_hormon) {
        this.anti_mullerian_hormon = anti_mullerian_hormon;
    }

    public void setFsh(int fsh) {
        this.fsh = fsh;
    }

    public void setLh(int lh) {
        this.lh = lh;
    }

    public void setProlaktin(int prolaktin) {
        this.prolaktin = prolaktin;
    }

    public void setOssztradiol(int ossztradiol) {
        this.ossztradiol = ossztradiol;
    }

    public void setProgeszteron(int progeszteron) {
        this.progeszteron = progeszteron;
    }

    public void setTotaltesztoszteron(int totaltesztoszteron) {
        this.totaltesztoszteron = totaltesztoszteron;
    }

    public void setAldoszteron(int aldoszteron) {
        this.aldoszteron = aldoszteron;
    }

    public void setKortizol(int kortizol) {
        this.kortizol = kortizol;
    }

    public void setHoma_index(int homa_index) {
        this.homa_index = homa_index;
    }

    public void setIgf_1(int igf_1) {
        this.igf_1 = igf_1;
    }

    public void setInzulin(int inzulin) {
        this.inzulin = inzulin;
    }

    public void setInzulin_reziztencia(int inzulin_reziztencia) {
        this.inzulin_reziztencia = inzulin_reziztencia;
    }

    public void setCa_125(int ca_125) {
        this.ca_125 = ca_125;
    }

    public void setHe4(int he4) {
        this.he4 = he4;
    }

    public void setCa15_3(int ca15_3) {
        this.ca15_3 = ca15_3;
    }

    public void setCa72_4(int ca72_4) {
        this.ca72_4 = ca72_4;
    }

    public void setCa19_9(int ca19_9) {
        this.ca19_9 = ca19_9;
    }

    public void setAfp(int afp) {
        this.afp = afp;
    }

    public void setCea(int cea) {
        this.cea = cea;
    }

    public void setPsa(int psa) {
        this.psa = psa;
    }

    public void setFpsa(int fpsa) {
        this.fpsa = fpsa;
    }

    public void setPro_psa(int pro_psa) {
        this.pro_psa = pro_psa;
    }

    public void setNse(int nse) {
        this.nse = nse;
    }

    public void setS100_protein(int s100_protein) {
        this.s100_protein = s100_protein;
    }

    public void setTpa(int tpa) {
        this.tpa = tpa;
    }

    public void setM2_pk_marker(int m2_pk_marker) {
        this.m2_pk_marker = m2_pk_marker;
    }

    public void setReumafaktor(int reumafaktor) {
        this.reumafaktor = reumafaktor;
    }

    public void setColiakiaszures(int coliakiaszures) {
        this.coliakiaszures = coliakiaszures;
    }

    public void setAnti_tpo(int anti_tpo) {
        this.anti_tpo = anti_tpo;
    }

    public void setThyreoglobulin_autoat(int thyreoglobulin_autoat) {
        this.thyreoglobulin_autoat = thyreoglobulin_autoat;
    }

    public void setTsh_receptor_autoat(int tsh_receptor_autoat) {
        this.tsh_receptor_autoat = tsh_receptor_autoat;
    }

    public void setFeherje_elfo(int feherje_elfo) {
        this.feherje_elfo = feherje_elfo;
    }

    public void setElfo_parapot(int elfo_parapot) {
        this.elfo_parapot = elfo_parapot;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public void setInmunglobuliun_a(int inmunglobuliun_a) {
        this.inmunglobuliun_a = inmunglobuliun_a;
    }

    public void setInmunglobulin_g(int inmunglobulin_g) {
        this.inmunglobulin_g = inmunglobulin_g;
    }

    public void setInmunglobulin_m(int inmunglobulin_m) {
        this.inmunglobulin_m = inmunglobulin_m;
    }

    public void setIgg_alosztalyok(int igg_alosztalyok) {
        this.igg_alosztalyok = igg_alosztalyok;
    }

    public int getIdklinikai_kemiai() {
        return idklinikai_kemiai;
    }
    
     public void setBetegAdat(Beteg_Adat beteg_Adat){
       this.beteg_Adat = beteg_Adat;
    }
    
    public Beteg_Adat getBetegAdat(){
        return beteg_Adat;
    }
    
    
    
    
    
    
    
    
}
