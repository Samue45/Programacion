package Week1.ProyectoFinal;

public class Persona {

    private String name;
    private FechaNacimiento fechaNacimiento;

    public Persona (String name, FechaNacimiento fechaNacimiento){
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", fechaNacimiento=" + fechaNacimiento.toString() +
                '}';
    }
}
