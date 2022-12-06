import java.util.ArrayList;

public abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    // Method

    public abstract double calcularPrecio();

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
