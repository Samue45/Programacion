package Week2.FinalProyect;

import java.util.ArrayList;

public class GestorEmpleados {

    private ArrayList<Empleado> empleadoArrayList;

    public GestorEmpleados(){
        this.empleadoArrayList = new ArrayList<>();
    }

    private boolean existEmpleado(Empleado empleado){
        for (Empleado empleado1 : empleadoArrayList){
            if ( empleado.getId() == empleado1.getId() && empleado.getNombre().equalsIgnoreCase(empleado1.getNombre())) {
                return true;
            }
        }

        return false;
    }

    public void addEmpleado(Empleado empleado){

        if (!existEmpleado(empleado)){
            empleadoArrayList.add(empleado);
        }else {
            System.err.println("ERROR :/, ya existe ese empleado");
        }
    }

    public void searchEmpleado(String nombre){
        for (Empleado empleado1 : empleadoArrayList){
            if (empleado1.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(empleado1.toString());
            }else {
                System.err.println("No existe");
            }
        }
    }

    public void mostrarTodos(){
        StringBuilder mensaje = new StringBuilder();

        for (Empleado empleado : empleadoArrayList){
            mensaje.append(empleado.toString()).append("\n");
        }

        System.out.println(mensaje);
    }

    public void pagarSueldos(){

        for (Empleado empleado : empleadoArrayList){
            empleado.recibirPago();
        }
    }

    public void tiposEmpleados(){
        int counterFijo = 0, counterPro = 0, counterFree = 0;

        for (Empleado empleado : empleadoArrayList){
            if (empleado instanceof EmpleadoFijo){
                counterFijo++;
            }
            if (empleado instanceof EmpleadoPorHoras){
                counterPro++;
            }
            if (empleado instanceof EmpleadoFreelance){
                counterFree++;
            }
        }
        System.out.println(" Hay " + counterFijo + " trabajadores Fijos \n" + counterPro + " trabajadores por Proyecto \n" + counterFree + " trabajadores Freelance \n");
    }
}
