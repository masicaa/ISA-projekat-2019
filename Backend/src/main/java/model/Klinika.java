package model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Klinika {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idKlinike;
    @Column
    private String nazivKlinike;
    @ManyToOne
    @JoinColumn(name = "adresa")
    private Adresa adresa;
    @Column
    private String opis;
    @Column
    private Double prosecnaOcena;

    public Klinika(){

    }

    public Long getIdKlinike() {
        return idKlinike;
    }

    public void setIdKlinike(Long idKlinike) {
        this.idKlinike = idKlinike;
    }

    public String getNazivKlinike() {
        return nazivKlinike;
    }

    public void setNazivKlinike(String nazivKlinike) {
        this.nazivKlinike = nazivKlinike;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(Double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    @OneToMany(mappedBy = "idKlinike")
    private Collection<Sala> sala;

    public Collection<Sala> getSala() {
        return sala;
    }

    public void setSala(Collection<Sala> sala) {
        this.sala = sala;
    }
}
