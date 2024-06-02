public class EmpleadoMedioTiempo extends Empleado {

    private double salarioH; //salario por hora
    private int h_sm; //horas por semana

    public EmpleadoMedioTiempo(String nombre, String ID, double salarioH, int h_sm) {
        super(nombre, ID);

        this.salarioH = salarioH;
        this.h_sm = h_sm;
    }

    @Override
    public double salario() {
        return salarioH * h_sm * 4; //salario mensual
    }
}
