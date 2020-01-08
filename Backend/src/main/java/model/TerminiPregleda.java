package model;

import javax.persistence.*;

@Entity
public class TerminiPregleda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idTermina")
    private Termin termin;

    @ManyToOne
    @JoinColumn(name = "idLekara")
    private Lekar lekar;

    @Column
    private Boolean slobodno;

    public TerminiPregleda(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public Lekar getLekar() {
        return lekar;
    }

    public void setLekar(Lekar lekar) {
        this.lekar = lekar;
    }

    public Boolean getSlobodno() {
        return slobodno;
    }

    public void setSlobodno(Boolean slobodno) {
        this.slobodno = slobodno;
    }
}
