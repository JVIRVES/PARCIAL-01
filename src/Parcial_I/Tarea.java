package Parcial_I;

public class Tarea {

    public String tituloTarea;
    public String descripcion;
    public String fechaLimite;
    public String prioridad;
    public String estado;

    public Tarea(String s, String string, String s1, String alta) {

    }

    public Tarea(String tituloTarea, String descripcion, String fechaLimite, String prioridad, String estado) {
        this.tituloTarea = tituloTarea;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public Tarea() {

    }


    public String getTituloTarea() {
        return tituloTarea;
    }

    public String setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
        return tituloTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
