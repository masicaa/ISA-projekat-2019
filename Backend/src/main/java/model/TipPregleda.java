package model;

import javax.persistence.*;

@Entity
public class TipPregleda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipaPregleda;

    @Column
    private String nazivTipaPregleda;

    public TipPregleda(){

    }

    public Long getIdTipPregleda() {
        return idTipaPregleda;
    }

    public void setIdTipPregleda(Long idTipPregleda) {
        this.idTipaPregleda = idTipPregleda;
    }

    public String getNazivTipaPregleda() {
        return nazivTipaPregleda;
    }

    public void setNazivTipaPregleda(String nazivTipaPregleda) {
        this.nazivTipaPregleda = nazivTipaPregleda;
    }
}
