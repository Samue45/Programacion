package Week2.FinalProyect;

public abstract class Empleado implements Pagable {

    private int id;
    private  String nombre;
    private  double salarioFinal;

    public Empleado(int id , String nombre, double salarioFinal) {
        this.id = id;
        this.nombre = nombre;
        this.salarioFinal = salarioFinal;
    }

    public abstract double calcularSalarioFinal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado [ Nombre = " + nombre + " SalarioFinal = " + salarioFinal + " ]";
    }
}
