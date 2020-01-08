package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MedicinskaSestra extends Korisnik{
    @ManyToOne
    @JoinColumn(name="idKlinike")
    private Klinika idKlinike;

    public MedicinskaSestra(){

    }

    public MedicinskaSestra(Klinika idKlinike) {
        this.idKlinike = idKlinike;
    }
}
