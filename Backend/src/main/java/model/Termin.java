package model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTermina;
    @Column
    private Date pocetakTermina;
    @Column
    private Date krajTermina;

    public Termin(){

    }

    public Long getIdTermina() {
        return idTermina;
    }

    public void setIdTermina(Long idTermina) {
        this.idTermina = idTermina;
    }

    public Date getPocetakTermina() {
        return pocetakTermina;
    }

    public void setPocetakTermina(Date pocetakTermina) {
        this.pocetakTermina = pocetakTermina;
    }

    public Date getKrajTermina() {
        return krajTermina;
    }

    public void setKrajTermina(Date krajTermina) {
        this.krajTermina = krajTermina;
    }
}
