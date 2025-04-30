package Week2.Day2;

public class Loro extends Animal{
    private String juguete;

    public Loro(String nombre,int edad,String juguete){
        super(nombre,edad);
        this.juguete = juguete;
    }

    @Override
    public String saludar() {
        return "Hola soy un Loro , me llamo " + super.getNombre() + " y tengo " + super.getEdad() + " años \n y mi juguete favorito es el " + juguete;
    }

    @Override
    public String emitirSonido() {
        return "Hola";
    }

    public String getJuguete() {
        return juguete;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "Loro ( Nombre = " + getNombre() + " Edad = " + getEdad() + " Juguete favorito = " + juguete ;
    }
}
