public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Jose", "195874322", 50000.00);
        empleados[1] = new EmpleadoMedioTiempo("Anexxon", "125248632", 30.0, 1000);
        empleados[2] = new EmpleadoMedioTiempo("dayana rios", "125248632", 30.0, 2000);
    

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getnombre());
            System.out.println("ID del empleado: "+ empleado.getId());
            System.out.println("Salario mensual: " + empleado.salario());
        }



        for (int i = 0; i < empleados.length; i++) {
         System.out.println("Empleado: " + empleados[i].getnombre());
         System.out.println("ID del empleado: " + empleados[i].getID());
         System.out.println("Salario mensual: " + empleados[i].salario()); 
        }

    }

    //que parte usamos polimorfismo?
    //que parte usamos herencia?
    //que parte usamos encapsulamiento?
    //que parte usamos abstaccion?

}
