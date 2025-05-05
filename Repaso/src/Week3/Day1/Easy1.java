package Week3.Day1;

import java.util.ArrayList;

public class Easy1 implements Operation {

   public void  prueba1(){
       Operation suma = ((a, b) -> a + b);
       Operation resta = ((a, b) -> a - b);
       Operation multi = ((a, b) -> a * b);
       Operation div = ((a, b) -> a / b);

       System.out.println("Ejemplos (a = 4 y b = 5) = \n " +
               "Suma = " + suma.operation(4,5) + "\n" +
               "Resta = " + resta.operation(4,5) + "\n" +
               "Multi = " + multi.operation(4,5) + "\n" +
               "Div = " + div.operation(4,5) + "\n");

   }

   public void prueba2 (){
       ArrayList<Operation> operationArrayList = new ArrayList<>();
       Operation suma = ((a, b) -> a + b);
       Operation resta = ((a, b) -> a - b);
       Operation multi = ((a, b) -> a * b);
       Operation div = ((a, b) -> a / b);

       operationArrayList.add(suma);
       operationArrayList.add(resta);
       operationArrayList.add(multi);
       operationArrayList.add(div);

       StringBuilder mensaje = new StringBuilder();

       for(Operation operation: operationArrayList){
           int resultado = operation.operation(8,2);
           mensaje.append("Resultado = ").append(resultado).append("\n");
       }

       System.out.println(mensaje);
   }

   public void prueba3(){

       // Hay 3 formas de usar una interfaz
       /*
       * 1º La implementas en la clase y defines que va a hacer el método
       * 2º Creas una clase anónima para simular que instancias la interfaz
       * 3º Creas una variable de dicha interfaz y empleas las expresiones lambda para definir el cuerpo del método abstracto
       * */

       Operation operation = new Operation() {
           @Override
           public int operation(int a, int b) {
               return 0;
           }
       };

       TextoTransformador p1 = (text -> text.toLowerCase() );
       TextoTransformador p2 = (text -> text.toUpperCase() );
       TextoTransformador p3 = (text -> "Tamaño = " + text.length() );
       TextoTransformador p4 = (text -> {
           StringBuilder mensaje= new StringBuilder();
           for (int i = text.length() -1; i > 0 ; i--) {
               mensaje.append(text.charAt(i));
           }
           return mensaje.toString();
       });
       TextoTransformador p5 = (text -> text.trim() );
       TextoTransformador p6 = (text -> text + " \uD83D\uDCA5 " );

       StringBuilder mensaje = new StringBuilder();

       mensaje.append("Resultado \n").append( p1.modificarTexto("HOLA, SOY PACO")).append("\n")
               .append( p2.modificarTexto("adiós, antonio")).append("\n")
               .append( p3.modificarTexto("Esternocleidomastoideo")).append("\n")
               .append( p4.modificarTexto("Esternocleidomastoideo")).append("\n")
               .append( p5.modificarTexto("   Esternoc  leidoma stoideo  ")).append("\n")
               .append( p6.modificarTexto("Esternocleidomastoideo")).append("\n");

       System.out.println(mensaje);
   }


   // en este caso se puede decir que se guarda el cuerpo del método, en los otros 2 casos no ocurre esto
    @Override
    public int operation(int a, int b) {
        return 0;
    }
}
