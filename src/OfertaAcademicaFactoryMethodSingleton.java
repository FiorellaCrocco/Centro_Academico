public class OfertaAcademicaFactoryMethodSingleton {
    private static OfertaAcademicaFactoryMethodSingleton instancia;

    private OfertaAcademicaFactoryMethodSingleton(){}

    public static OfertaAcademicaFactoryMethodSingleton obtenerInstancia(){

        if (OfertaAcademicaFactoryMethodSingleton.instancia == null) {
            OfertaAcademicaFactoryMethodSingleton.instancia = new OfertaAcademicaFactoryMethodSingleton();
        }

        return OfertaAcademicaFactoryMethodSingleton.instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo){
        switch (tipo) {
            case "Curso":
                return new Curso();
            case "Carrera":
                return new CarreraComposite();
        }
                return null;
    }


}
