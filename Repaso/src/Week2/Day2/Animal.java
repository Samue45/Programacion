package Week2.Day2;

public abstract class Animal implements  AnimalI{

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  String emitirSonido(){
        return "Soy animal y hago sonido";
    }

    public String saludar(){
        return "Hola soy un animal, me llamo " + nombre + " y tengo " + edad + " años";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
