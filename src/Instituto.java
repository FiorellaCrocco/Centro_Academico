import java.util.ArrayList;

public class Instituto {
    private ArrayList<OfertaAcademica> ofertaAcademica = new ArrayList();

    // Methods
    public String generarInforme(){
        String aux = "";

        for (OfertaAcademica of:this.ofertaAcademica) {
                aux += of.getNombre() + " " + of.calcularPrecio()+ "\n ";
        }

        return "CURSOS Y CARRERAS: " + "\n " + aux;
    }

    public void agregarCurso(OfertaAcademica curso){
        this.ofertaAcademica.add(curso);
    } // SIRVE TANTO PARA CURSOS O CARRERAS

    public void quitarCurso(OfertaAcademica curso) {
        this.ofertaAcademica.remove(curso);
    } // SIRVE TANTO PARA CURSOS O CARRERAS

    // Getters and Setters
    public ArrayList<OfertaAcademica> getOfertaAcademica() {
        return ofertaAcademica;
    }

    public void setOfertaAcademica(ArrayList<OfertaAcademica> ofertaAcademica) {
        this.ofertaAcademica = ofertaAcademica;
    }
}
