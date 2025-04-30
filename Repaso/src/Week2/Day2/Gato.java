package Week2.Day2;

public class Gato extends Animal {

    private String pescado;

    public Gato(String nombre,int edad,String pescado){
        super(nombre,edad);
        this.pescado = pescado;
    }

    @Override
    public String saludar() {
        return "Hola soy un Gato , me llamo " + super.getNombre() + " y tengo " + super.getEdad() + " años \n y mi pescado favorito es el " + pescado;
    }

    @Override
    public String emitirSonido() {
        return "Miau, miau";
    }

    public String getPescado() {
        return pescado;
    }

    public void setPescado(String color) {
        this.pescado = color;
    }

    @Override
    public String toString() {
        return "Gato ( Nombre = " + getNombre() + " Edad = " + getEdad() + " Pescado favorito = " + pescado ;
    }
}
