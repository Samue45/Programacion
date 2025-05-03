package Week2.FinalProyect;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    public double tarifaPorHora;

    public EmpleadoPorHoras(int id ,String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioFinal() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public void recibirPago() {

    }
}
