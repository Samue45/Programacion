package Week1.Day1.Bloque3;

public abstract class Usuario {
    private String nombre;
    private Notificador notificador;

    public Usuario (String nombre, Notificador notificador){
        this.nombre = nombre;
        this.notificador = notificador;
    }

    public  void enviarNotificacion(String mensaje){
        notificador.notificar(nombre,mensaje);
    };


}
