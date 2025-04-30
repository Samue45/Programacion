package Week2.Day2;

public class Perro extends Animal {

    private String color;

    public Perro(String nombre,int edad,String color){
        super(nombre,edad);
        this.color = color;
    }

    @Override
    public String saludar() {
        return "Hola soy un Perro , me llamo " + super.getNombre() + " y tengo " + super.getEdad() + " años \n y mi color favorito es el " + color;
    }

    @Override
    public String emitirSonido() {
        return "Guau, guau";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro ( Nombre = " + getNombre() + " Edad = " + getEdad() + " Color favorito = " + color ;
    }
}
