package ar.edu.undec.neutron.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Prestamo implements Serializable {
    private Integer id;
    private Date fechainicio;
    private Date fechafin;
    private Integer personaid;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    @Basic
    @Column(name = "fechainicio")
    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    @Basic
    @Column(name = "fechafin")
    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    @Basic
    @Column(name = "personaid")
    public Integer getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Integer personaid) {
        this.personaid = personaid;
    }
}
