package Week1.Day1.Bloque1;

public class EmpleadoPorHoras extends Empleado {
    int horasTrabajadas;


    public EmpleadoPorHoras(String nombre,int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return horasTrabajadas * 15;
    }

    @Override
    public String imprimirDatos(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append(super.imprimirDatos()).append(" Sueldo = ") .append(calcularSalario());
        return mensaje.toString();
    }
}
