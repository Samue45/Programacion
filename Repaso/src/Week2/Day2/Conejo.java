package Week2.Day2;

public class Conejo extends Animal {

    public Conejo(String nombre,int edad){
        super(nombre,edad);
    }

    @Override
    public String saludar() {
        return "Hola soy un Loro , me llamo " + super.getNombre() + " y tengo " + super.getEdad() + " años ";
    }

    @Override
    public String emitirSonido() {
        return "Hola";
    }

    @Override
    public String toString() {
        return "Conejo ( Nombre = " + getNombre() + " Edad = " + getEdad() ;
    }

}
