import Week2.Day1.Carrito;
import Week2.Day1.Medium1;
import Week2.Day2.CentroAdopcion;
import Week2.Day2.Gato;
import Week2.Day2.Loro;
import Week2.Day2.Perro;
import Week2.Day3.PruebaEasy3;
import Week2.Day4.Pajaro;
import Week2.Day4.Persona;
import Week2.Day4.SerVivo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       day4();
    }

    public static void day1(){
        Medium1 medium1 = new Medium1();
        medium1.mediumLevel();

        Carrito carrito = new Carrito();
        carrito.addProducto("Peras", 30,2.90);
        carrito.addProducto("Avena", 90,1.90);
        carrito.addProducto("Yogur", 120,0.90);

        System.out.println("Total coste del carrito " + carrito.calculateTotalPriceCarrito());
    }
    public static void day2(){
        CentroAdopcion centro = new CentroAdopcion();
        centro.admitirAnimal(new Perro("Rex", 3, "Verde"));
        centro.admitirAnimal(new Gato("Misu", 2, "Salmón"));
        centro.admitirAnimal(new Loro("Piolín", 1, "Piano"));
        centro.admitirAnimal(new Perro("Leo", 3, "Negro"));
        centro.admitirAnimal(new Perro("Robin", 1, "Azul"));
        centro.admitirAnimal(new Perro("Lucas", 2, "Blanco"));

        centro.mostrarTodos();

        System.out.println(centro.searchAnimal("Rex").toString());
        centro.contarTipoAnimal();

    }
    public static void day3(){
        PruebaEasy3 pruebaEasy3 = new PruebaEasy3();
        pruebaEasy3.prueba();

    }
    public static void day4(){
        ArrayList<SerVivo> serVivoArrayList = new ArrayList<>();

        serVivoArrayList.add(new Pajaro("Pájaro 1"));
        serVivoArrayList.add(new Pajaro("Pájaro 2"));
        serVivoArrayList.add(new Pajaro("Pájaro 3"));
        serVivoArrayList.add(new Pajaro("Pájaro 4"));
        serVivoArrayList.add(new Persona("Juan"));
        serVivoArrayList.add(new Persona("Paco"));
        serVivoArrayList.add(new Persona("Manuel"));

        for (SerVivo serVivo: serVivoArrayList){
            if (serVivo instanceof Pajaro){

                System.out.println( ((Pajaro) serVivo).volar());
            }
            if (serVivo instanceof  Persona){

                System.out.println( serVivo.respirar());
            }
        }
    }
}