package Week5.Day1;

public class Pedido {
    private int id;
    private String cliente;
    private String nombre;

    public Pedido(String cliente ,String nombre) {
        this.id = 0;
        this.nombre = nombre;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return  "Pedido [ID: " + id + ", Cliente: " + cliente + ", Nombre: " + nombre + "]";
    }
}
