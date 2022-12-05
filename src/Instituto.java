import java.util.ArrayList;

public class Instituto {
    private ArrayList<OfertaAcademica> ofertaAcademica = new ArrayList();

    public String generarInforme(){
        String aux = "";

        for (OfertaAcademica of:this.ofertaAcademica) {

            if (of.getNombre().equals("Full Stack")){
                aux += of.nombre + " " + of.getCosto() + "\n ";
            } else {
                aux += of.getNombre() + " " + of.calcularPrecio() + "\n ";
            }
        }

        return "CURSOS Y CARRERAS: " + "\n " + aux;
    }

    public void agregarCurso(OfertaAcademica curso){
        this.ofertaAcademica.add(curso);
    }

    public void quitarCurso(OfertaAcademica curso) {
        this.ofertaAcademica.remove(curso);
    }


    public void agregarCarrera(OfertaAcademica curso){
        this.ofertaAcademica.add(curso);
    }

    public void quitarCarrera(OfertaAcademica curso) {
        this.ofertaAcademica.remove(curso);
    }

   /* public ArrayList<OfertaAcademica> getOfertaAcademica() {
        return ofertaAcademica;
    }*/

}
