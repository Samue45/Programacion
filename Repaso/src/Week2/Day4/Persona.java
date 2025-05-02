package Week2.Day4;

public class Persona extends SerVivo{
    public Persona(String nombre) {
        super(nombre);
    }

    @Override
    public String respirar() {
        return "Soy " + super.getNombre() + " y estoy respirando";
    }
}
