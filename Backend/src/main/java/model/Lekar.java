package model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Lekar extends Korisnik{
    @ManyToOne
    private Klinika idKlinike;
    @Column(name = "pocetak")
    private Date datumIVremePocetka;
    @Column(name = "kraj")
    private Date datumIVremeKraja;

    public Lekar(){

    }

    public Klinika getIdKlinike() {
        return idKlinike;
    }

    public void setIdKlinike(Klinika idKlinike) {
        this.idKlinike = idKlinike;
    }

    public Date getDatumIVremePocetka() {
        return datumIVremePocetka;
    }

    public void setDatumIVremePocetka(Date datumIVremePocetka) {
        this.datumIVremePocetka = datumIVremePocetka;
    }

    public Date getDatumIVremeKraja() {
        return datumIVremeKraja;
    }

    public void setDatumIVremeKraja(Date datumIVremeKraja) {
        this.datumIVremeKraja = datumIVremeKraja;
    }
}
