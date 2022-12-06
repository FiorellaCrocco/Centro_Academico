public class Main {
    public static void main(String[] args) {

        OfertaAcademicaFactoryMethodSingleton creador = OfertaAcademicaFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nCURSO FRONT END:");
        Curso cursoFrontEnd = (Curso) creador.crearOfertaAcademica("Curso");
        cursoFrontEnd.setNombre("FrontEnd");
        cursoFrontEnd.setDescripcion("Algo para probar");
        cursoFrontEnd.setCargaHorariaMensual(16);
        cursoFrontEnd.setMesesDeDuracion(2);
        cursoFrontEnd.setValorHora(900);
        System.out.println("Precio $" + cursoFrontEnd.calcularPrecio());

        System.out.println("\nCURSO BACK END:");
        Curso cursoBackEnd = (Curso) creador.crearOfertaAcademica("Curso");
        cursoBackEnd.setNombre("BackEnd");
        cursoBackEnd.setDescripcion("Algo para probar");
        cursoBackEnd.setCargaHorariaMensual(20);
        cursoBackEnd.setMesesDeDuracion(2);
        cursoBackEnd.setValorHora(1000);
        System.out.println("Precio $" + cursoBackEnd.calcularPrecio());

        System.out.println("\nCARRERA FULL STACK:");
        CarreraComposite carreraFullStack = (CarreraComposite) creador.crearOfertaAcademica("Carrera");
        carreraFullStack.setNombre("Full Stack");
        carreraFullStack.setDescripcion("Algo para probar carrera");
        carreraFullStack.agregarCurso(cursoFrontEnd);
        carreraFullStack.agregarCurso(cursoBackEnd);
        carreraFullStack.setPorcentajeDeBonificacion(20);
        System.out.println("Precio $" + carreraFullStack.calcularPrecio());

        System.out.println("\nINSTITUTO:");
        Instituto ins = new Instituto();
        ins.agregarCurso(cursoBackEnd);
        ins.agregarCurso(cursoFrontEnd);
        ins.agregarCurso(carreraFullStack);
        System.out.println(ins.generarInforme());
    }
}
