package model;

import javax.persistence.*;

@Entity
public class TipPregledaKlinika {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idTipaPregleda")
    private TipPregleda tipPregleda;

    @ManyToOne
    @JoinColumn(name = "idKlinike")
    private Klinika klinika;

    public TipPregledaKlinika(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipPregleda getTipPregleda() {
        return tipPregleda;
    }

    public void setTipPregleda(TipPregleda tipPregleda) {
        this.tipPregleda = tipPregleda;
    }

    public Klinika getKlinika() {
        return klinika;
    }

    public void setKlinika(Klinika klinika) {
        this.klinika = klinika;
    }
}
