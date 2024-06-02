abstract public class Empleado {

    private String nombre;
    private String ID;

    public Empleado (String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public abstract double salario();
}