package Week1.Day1.Bloque1;

public class EmpleadoTiempoCompleto extends Empleado {

    int BONUS = 500;
    double SALARIOBASE  = 1.184;

    public EmpleadoTiempoCompleto(String nombre){
        super(nombre);
    }

    @Override
    double calcularSalario() {
        return SALARIOBASE + BONUS;
    }

    @Override
    public String imprimirDatos(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append(super.imprimirDatos()).append(" Sueldo = ") .append(calcularSalario());
        return mensaje.toString();
    }
}
