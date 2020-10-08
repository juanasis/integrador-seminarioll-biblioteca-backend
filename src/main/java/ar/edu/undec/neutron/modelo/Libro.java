package ar.edu.undec.neutron.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Libro implements Serializable {
    private Integer id;
    private String titulo;
    private Integer cantidadpaginas;
    private Date fechapublicacion;
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    @Basic
    @Column(name = "titulo")
    public String getTitulo() {
        return titulo;
    }
    @Basic

    @Column(name = "cantidadpaginas")
    public Integer getCantidadpaginas() {
        return cantidadpaginas;
    }
    @Basic
    @Column(name = "fechapublicacion")
    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCantidadpaginas(Integer cantidadpaginas) {
        this.cantidadpaginas = cantidadpaginas;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id) &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(cantidadpaginas, libro.cantidadpaginas) &&
                Objects.equals(fechapublicacion, libro.fechapublicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, cantidadpaginas, fechapublicacion);
    }
}
