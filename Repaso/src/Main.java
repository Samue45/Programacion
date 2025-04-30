import Week2.Day1.Carrito;
import Week2.Day1.Medium1;
import Week2.Day2.CentroAdopcion;
import Week2.Day2.Gato;
import Week2.Day2.Loro;
import Week2.Day2.Perro;
import Week2.Day3.PruebaEasy3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       day3();
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
}