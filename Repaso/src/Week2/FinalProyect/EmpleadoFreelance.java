package Week2.FinalProyect;

public class EmpleadoFreelance extends Empleado{

    private int proyectos;
    private double pagoPorProyecto;

    public EmpleadoFreelance(int id ,String nombre, double salarioFinal, int proyectos, double pagoPorProyecto) {
        super(id, nombre, salarioFinal);
        this.proyectos = proyectos;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSalarioFinal() {
        return proyectos * pagoPorProyecto;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public void recibirPago() {

    }
}
