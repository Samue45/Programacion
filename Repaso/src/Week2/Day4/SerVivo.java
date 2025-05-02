package Week2.Day4;

public abstract class SerVivo
{
    private String nombre;

    public SerVivo(String nombre) {
        this.nombre = nombre;
    }

    public abstract String respirar();

    public String getNombre() {
        return nombre;
    }
}
