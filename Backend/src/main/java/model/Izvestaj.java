package model;

import javax.persistence.*;

@Entity
public class Izvestaj {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIzvestaja;

    @ManyToOne
    @JoinColumn(name = "idPregleda")
    private Pregled pregled;

    @ManyToOne
    @JoinColumn(name = "idDijagnoze")
    private Dijagnoza dijagnoza;

    @Column(length = 500)
    private String recept;

    @Column
    private Boolean overeno;

    public Izvestaj(){

    }

    public Long getIdIzvestaja() {
        return idIzvestaja;
    }

    public void setIdIzvestaja(Long idIzvestaja) {
        this.idIzvestaja = idIzvestaja;
    }

    public Pregled getPregled() {
        return pregled;
    }

    public void setPregled(Pregled pregled) {
        this.pregled = pregled;
    }

    public Dijagnoza getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(Dijagnoza dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }

    public Boolean getOvereno() {
        return overeno;
    }

    public void setOvereno(Boolean overeno) {
        this.overeno = overeno;
    }
}
