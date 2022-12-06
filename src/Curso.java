public class Curso extends OfertaAcademica{

    private double cargaHorariaMensual;
    private int mesesDeDuracion;
    private double valorHora;

    // Getters and Setters
    @Override
    public double calcularPrecio() {
        return this.cargaHorariaMensual * this.valorHora * this.mesesDeDuracion;
    }

    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public int getMesesDeDuracion() {
        return mesesDeDuracion;
    }

    public void setMesesDeDuracion(int mesesDeDuracion) {
        this.mesesDeDuracion = mesesDeDuracion;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
