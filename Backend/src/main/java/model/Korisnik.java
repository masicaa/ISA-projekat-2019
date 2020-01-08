package model;

import javax.persistence.*;

@MappedSuperclass
public abstract class Korisnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="jmbg")
    protected Long jmbg;
    @Column(name = "ime",length = 50)
    protected String ime;
    @Column(name = "prezime",length=150)
    protected String prezime;
    @Column(name="email",nullable = false)
    protected String email;
    @Column(name = "lozinka", nullable = false)
    protected String lozinka;

    public Long getJmbg() {
        return jmbg;
    }

    public void setJmbg(Long jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
}
