package ar.edu.undec.neutron.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    @Column(name = "fechainicio")
    private Date fechainicio;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    @Column(name = "fechafin")
    private Date fechafin;
    @JoinColumn(name = "personaid", referencedColumnName = "id")
    @ManyToOne
    private Persona personaid;
    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {        return id;    }
    public Date getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    public Date getFechafin() {
        return fechafin;
    }
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    public Persona getPersonaid() {
        return personaid;
    }
    public void setPersonaid(Persona personaid) {
        this.personaid = personaid;
    }


}
