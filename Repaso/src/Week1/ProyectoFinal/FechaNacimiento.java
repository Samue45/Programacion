package Week1.ProyectoFinal;

import java.time.LocalDate;

public class FechaNacimiento {
    private LocalDate fecha;


    public FechaNacimiento(int year, int month, int day){
         fecha = LocalDate.of(year,month,day);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Año [ ").append(getFecha().getYear()).append(" ]").append("Mes [ ").append(getFecha().getMonth()).append(" ]").append("Día [ ").append(getFecha().getDayOfMonth()).append(" ]");
        return mensaje.toString();
    }
}
