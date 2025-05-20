package Week1.Day2.Bloque1;

public class Persona {
    private String nombre;
    int edad;
    String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Persona [ ").append("NOMBRE  = ").append(nombre).append(" tiene ").append(edad).append(" años").append(" y vive en ").append(ciudad).append(" ]");
        return mensaje.toString();
    }
}
