package model;

import javax.persistence.*;

@Entity
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSale;
    @Column
    private String nazivSale;
    @Column
    private Integer brojSale;
    @ManyToOne
    @JoinColumn(name="idKlinike")
    private Klinika idKlinike;

    public Sala(){

    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public String getNazivSale() {
        return nazivSale;
    }

    public void setNazivSale(String nazivSale) {
        this.nazivSale = nazivSale;
    }

    public Integer getBrojSale() {
        return brojSale;
    }

    public void setBrojSale(Integer brojSale) {
        this.brojSale = brojSale;
    }

    public Klinika getIdKlinike() {
        return idKlinike;
    }

    public void setIdKlinike(Klinika idKlinike) {
        this.idKlinike = idKlinike;
    }
}
