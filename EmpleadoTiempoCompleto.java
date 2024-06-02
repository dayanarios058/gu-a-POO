public class EmpleadoTiempoCompleto extends Empleado {
    private double salario;

    public EmpleadoTiempoCompleto (String nombre, String ID, double salario) {
        super(nombre, ID);
        this.salario = salario;
    }

    @Override
    public double salario() {
        return salario / 12;
    }
}
