package Week2.Day3;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaEasy3 {

    private  ArrayList<Figura> figuras;

    public PruebaEasy3() {
        this.figuras = new ArrayList<>();
    }

    public  void prueba(){
       figuras.add(new Circulo(2.33));
       figuras.add(new Circulo(1.55));
       figuras.add(new Circulo(0.54));
       figuras.add(new Circulo(2));
       figuras.add(new Rectangulo(12,50));
       figuras.add(new Rectangulo(2,5));
       figuras.add(new Rectangulo(12,12.3));

       Iterator<Figura> iterator = figuras.iterator();
       StringBuilder mensaje = new StringBuilder();

       int contadorCir = 0, contadorRec = 0;

       while (iterator.hasNext()){
           Figura figura = iterator.next();
           if (figura instanceof Circulo){
               mensaje.append("Circulo [ ").append(" Área = ").append(figura.calcularArea()).append(" ]\n");
               contadorCir++;
           }
           if (figura instanceof Rectangulo){
               mensaje.append("Rectangulo [ ").append(" Área = ").append(figura.calcularArea()).append(" ]\n");
               contadorRec++;
           }

           mostrarTipo(figura);
       }

       System.out.println(mensaje);
        System.out.println("En total hay " + contadorRec + " Rectangulos y " + contadorCir + " Círculos" );
   }

    private  void mostrarTipo(Figura f){
        String mensaje = "";
        if (f instanceof Circulo){
            mensaje = "Es un círculo";
        } else if (f instanceof  Rectangulo) {
            mensaje = "Es un rectángulo";
        } else if (f instanceof Triangulo) {
            mensaje = "Es un triángulo";

        }else {
            mensaje = "Dato no válido";
        }

       System.out.println(mensaje);
   }
}
