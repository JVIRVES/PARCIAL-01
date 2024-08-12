package Parcial_I;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private String correo;

    //constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



}
