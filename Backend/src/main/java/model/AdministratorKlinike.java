package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AdministratorKlinike extends Korisnik{
    @ManyToOne
    @JoinColumn(name = "idKlinike")
    private Klinika idKlinike;
}
