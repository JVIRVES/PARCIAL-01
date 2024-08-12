package Parcial_I;

//Herencia
public class Usuario extends Persona {

    //Atributos
   private int ID;
   private String nombreUsuario;

   //constructores
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, int ID, String nombreUsuario) {
        super(nombre, apellido, correo);
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
    }

    //Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void crearusuaio() {

        System.out.println("Creando usuaio");
    }

    public void eliminarusuaio() {}

}
