import java.util.ArrayList;

public abstract class OfertaAcademica {
    protected String nombre;
    protected String descripcion;
    protected double costo;

    private ArrayList<Curso> cursos = new ArrayList();
    private ArrayList<CarreraComposite> carreras = new ArrayList();


    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<CarreraComposite> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<CarreraComposite> carreras) {
        this.carreras = carreras;
    }
}
