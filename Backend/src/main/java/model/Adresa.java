package model;

import javax.persistence.*;

@Entity
public class Adresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdrese;
    @Column
    private String drzava;
    @Column
    private String grad;
    @Column
    private String adresa;
    @Column
    private Integer broj;

    public Adresa(){

    }

    public Long getIdAdrese() {
        return idAdrese;
    }

    public void setIdAdrese(Long idAdrese) {
        this.idAdrese = idAdrese;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }
}
