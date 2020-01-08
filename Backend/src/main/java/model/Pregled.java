package model;


import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;

@Entity
public class Pregled {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPregleda;

    @ManyToOne
    @JoinColumn(name = "idKlinike")
    private Klinika klinika;

    @ManyToOne
    @JoinColumn(name = "idTipaPregleda")
    private TipPregleda tipPregleda;

    @ManyToOne
    @JoinColumn(name = "idTerminPregleda")
    private TerminiPregleda terminPregleda;

    @ManyToOne
    @JoinColumn(name = "idSale")
    private Sala sala;

    @Column
    private Double cena;

    @ManyToOne
    @JoinColumn(name = "idPacijenta")
    private Pacijent pacijent;

    @Column
    private Boolean pregldedOdobren;

    @Column
    private Boolean pregledZavrsen;

    public Pregled(){

    }


    public Long getIdPregleda() {
        return idPregleda;
    }

    public void setIdPregleda(Long idPregleda) {
        this.idPregleda = idPregleda;
    }

    public Klinika getKlinika() {
        return klinika;
    }

    public void setKlinika(Klinika klinika) {
        this.klinika = klinika;
    }

    public TipPregleda getTipPregleda() {
        return tipPregleda;
    }

    public void setTipPregleda(TipPregleda tipPregleda) {
        this.tipPregleda = tipPregleda;
    }

    public TerminiPregleda getTerminPregleda() {
        return terminPregleda;
    }

    public void setTerminPregleda(TerminiPregleda terminPregleda) {
        this.terminPregleda = terminPregleda;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Boolean getPregldedOdobren() {
        return pregldedOdobren;
    }

    public void setPregldedOdobren(Boolean pregldedOdobren) {
        this.pregldedOdobren = pregldedOdobren;
    }

    public Boolean getPregledZavrsen() {
        return pregledZavrsen;
    }

    public void setPregledZavrsen(Boolean pregledZavrsen) {
        this.pregledZavrsen = pregledZavrsen;
    }
}
