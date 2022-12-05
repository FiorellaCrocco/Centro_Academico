import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica{

    private ArrayList<Curso> cursos = new ArrayList();

    @Override
    public double calcularPrecio() {
        double aux = 0;
        for (OfertaAcademica of:cursos){
            aux += of.calcularPrecio();
        }
        return aux;
    }

    public double calcularPrecio(double descuento) {
        double aux = 0;
        for (OfertaAcademica of:cursos){
            aux += of.calcularPrecio();
        }
        return aux - (aux / 100 * descuento);
    }

    public void agregarCurso(OfertaAcademica curso){
        this.cursos.add((Curso) curso);
    }

    public void quitarCurso(OfertaAcademica curso) {
        this.cursos.remove(curso);
    }

    public String mostrarCurso(){
        String cursosImpl = "";
        for (OfertaAcademica of:cursos) {
            cursosImpl+= "\n "+ "- " + of.nombre;
        }
        return cursosImpl;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
