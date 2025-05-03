package Week2.FinalProyect;

public class EmpleadoFijo extends Empleado{

    private double bonusMensual;

    public EmpleadoFijo(int id ,String nombre, double salarioBase, double bonusMensual) {
        super(id,nombre, salarioBase);
        this.bonusMensual = bonusMensual;
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioFinal() + bonusMensual;
    }

    @Override
    public void recibirPago() {
        // Digamos que este método metería el salario final en su cuenta bancaria
    }
}
