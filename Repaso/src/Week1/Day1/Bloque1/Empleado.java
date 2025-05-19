package Week1.Day1.Bloque1;

public abstract class Empleado {
    String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    abstract double calcularSalario();

    public String imprimirDatos(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Empleado [ ").append("Nombre = ").append(nombre).append(" ]");
        return mensaje.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
