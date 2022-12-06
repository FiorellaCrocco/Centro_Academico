import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica{

    private ArrayList<Curso> cursos = new ArrayList();

    private double porcentajeDeBonificacion;

    //Methods

    @Override
    public double calcularPrecio() {
        double aux = 0;
        for (OfertaAcademica of:cursos){
            aux += of.calcularPrecio();
        }
        return aux - ( (aux * porcentajeDeBonificacion) / 100 );
    }

    public void agregarCurso(OfertaAcademica curso){
        this.cursos.add((Curso) curso);
    }

    public void quitarCurso(OfertaAcademica curso) {
        this.cursos.remove(curso);
    }

    // Getters and Setters


    public double getPorcentajeDeBonificacion() {
        return porcentajeDeBonificacion;
    }

    public void setPorcentajeDeBonificacion(double porcentajeDeBonificacion) {
        this.porcentajeDeBonificacion = porcentajeDeBonificacion;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
