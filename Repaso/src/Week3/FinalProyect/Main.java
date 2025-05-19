package Week3.FinalProyect;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        p1();
        p2();
        p3();
        bonus();
    }

    public static void p1(){
        Operacion suma = (a,b) -> { return  a + b; };
        Operacion multi = (a,b) -> { return  a * b; };

        System.out.println("Suma = " + suma.operar(5,3));
        System.out.println("Multi = " + multi.operar(5,3));

    }
    public static void p2(){
        TransformadorTexto upperCase = (text) -> text.toUpperCase();
        TransformadorTexto clean = (text) ->text.trim();

        TransformadorTexto darVuelta = new TransformadorTexto() {
            @Override
            public String transformar(String texto) {
                StringBuilder mensaje = new StringBuilder();
                for (int i = texto.length() - 1; i >= 0; i--){
                    mensaje.append(texto.charAt(i));
                }
                return mensaje.toString();
            }
        };

        String textPrueba = "Hola Mundo";
        System.out.println("Mayúscula = " + upperCase.transformar(textPrueba));
        System.out.println("Sin espacios al inicio y fin = " + clean.transformar(textPrueba));
        System.out.println("Dar vuelta = " + darVuelta.transformar(textPrueba));


    }
    public static void p3(){
        List<String> nombres = List.of("Ana", "Pedro", "Amalia", "Luis", "Andrés", "Paco");

        nombres.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .map(name -> name.toUpperCase())
                .sorted()
                .forEach(name -> System.out.println("Nombre = " + name));
    }
    public static void bonus(){
        Operacion suma = (a,b) -> a + b;
        Operacion resta = (a,b) -> a - b;
        Operacion multi = (a,b) -> a * b;
        Operacion div = (a,b) -> a / b;
        Operacion mod = (a,b) -> a % b;

        List<Operacion> operacions = List.of(suma,resta,multi,div,mod);

        System.out.println("Operaciones");
        for (Operacion operacion : operacions){
            int resultado = operacion.operar(6,2);
            System.out.println(resultado);
        }

    }

}
