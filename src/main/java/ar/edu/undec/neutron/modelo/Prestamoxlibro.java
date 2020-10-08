package ar.edu.undec.neutron.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Prestamoxlibro implements Serializable {

    private Integer id;
    private Integer libroid;
    private Integer prestamoid;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }
    @Basic
    @Column(name = "libroid")
    public Integer getLibroid() {
        return libroid;
    }

    public void setLibroid(Integer libroid) {
        this.libroid = libroid;
    }
    @Basic
    @Column(name = "prestamoid")
    public Integer getPrestamoid() {
        return prestamoid;
    }

    public void setPrestamoid(Integer prestamoid) {
        this.prestamoid = prestamoid;
    }
}
