package ar.edu.undec.neutron.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Prestamoxlibro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "libroid", referencedColumnName = "id")
    @ManyToOne
    private Libro libroid;

    @JoinColumn(name = "prestamoid", referencedColumnName = "id")
    @ManyToOne
    private Prestamo prestamoid;

    public Integer getId() {
        return id;
    }

       public Libro getLibroid() {
        return libroid;
    }

    public void setLibroid(Libro libroid) {
        this.libroid = libroid;
    }

    public Prestamo getPrestamoid() {
        return prestamoid;
    }

    public void setPrestamoid(Prestamo prestamoid) {
        this.prestamoid = prestamoid;
    }
}
