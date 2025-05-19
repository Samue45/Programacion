import Week1.Day1.Bloque1.Empleado;
import Week1.Day1.Bloque1.EmpleadoPorHoras;
import Week1.Day1.Bloque1.EmpleadoTiempoCompleto;
import Week1.Day1.Bloque2.Operacion;
import Week1.Day1.Bloque3.Notificador;
import Week1.Day1.Bloque3.Usuario;
import Week1.Day1.Bloque3.UsuarioEmail;
import Week1.Day1.Bloque3.UsuarioSMS;

public class Main {
    public static void main(String[] args) {
        day1();
    }

    public static void day1(){
        block1();
        block2();
        block3();

    }

    public static void block1(){
        Empleado empleado1 = new EmpleadoPorHoras("Paco", 300);
        Empleado empleado2 = new EmpleadoTiempoCompleto("Juan");
        Empleado empleado3 = new EmpleadoPorHoras("Antonio", 500);
        Empleado empleado4 = new EmpleadoTiempoCompleto("María");

        Empleado[] empleados = {empleado1,empleado2,empleado3,empleado4};

        for(Empleado empleado: empleados){
            System.out.println(empleado.imprimirDatos());
        }
    }

    public static void block2() {
        Operacion suma = (a, b) -> { return a + b;};
        Operacion resta = (a, b) -> {return  a - b;};
        Operacion multiplicacion = (a, b) -> {return  a * b;};
        Operacion personal = (a, b) -> {
            if (a > b){
                return a - b;
            }else {
                return a + b;
            }
        };

        System.out.println("-------Operaciones con lambdas-------");
        System.out.println("Suma = " + aplicarOperacion(suma,5,5));

        System.out.println("Resta = " + aplicarOperacion(resta,5,5));

        System.out.println("Multiplicación = " + aplicarOperacion(multiplicacion,5,5));

        System.out.println("Personal = " + aplicarOperacion(personal,5,5));

        Operacion operacion = new Operacion() {
            @Override
            public int ejecutar(int a, int b) {
                return 0;
            }
        };
    }

    public static int aplicarOperacion(Operacion op, int a, int b){
        return op.ejecutar(a,b);
    }

    public static void block3(){
        Notificador consola = (nombre, mensaje) -> System.out.println("Nombre = " + nombre + " Mensaje = " + mensaje);
        Notificador mayuscula = (nombre, mensaje) -> System.out.println("Nombre = " + nombre.toUpperCase() + " Mensaje = " + mensaje.toUpperCase());
        Notificador email = (nombre, mensaje) -> System.out.println("Autor del correo = " + nombre + " Mensaje a tratar = " + mensaje);


        Usuario usuario1 = new UsuarioEmail("Juan", consola);
        Usuario usuario2 = new UsuarioSMS("María", mayuscula);
        Usuario usuario3 = new UsuarioSMS("Paco",email);

        usuario1.enviarNotificacion("Cuñaaaaaaaaao");
        usuario2.enviarNotificacion("Hola");
        usuario3.enviarNotificacion("Mamahuevo");
    }




}