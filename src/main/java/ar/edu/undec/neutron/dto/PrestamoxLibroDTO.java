package ar.edu.undec.neutron.dto;

public class PrestamoxLibroDTO {
    private int id;
    private String titulo;
    private String apellido;
    private String nombre;

    public PrestamoxLibroDTO(int id, String titulo, String apellido, String nombre) {
        this.id = id;
        this.titulo = titulo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    public PrestamoxLibroDTO(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
