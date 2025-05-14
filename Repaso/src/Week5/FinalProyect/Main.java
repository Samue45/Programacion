package Week5.FinalProyect;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();


        catalogo.createCategory("Frutas");
        catalogo.createCategory("Bebidas");
        catalogo.createCategory("Lácteos");
        catalogo.createCategory("Snacks");

        catalogo.añadirProducto("Frutas", "Manzanas", 3.5, 50);
        catalogo.añadirProducto("Frutas", "Peras", 1.5, 70);
        catalogo.añadirProducto("Frutas", "Plátanos", 5.5, 30);
        catalogo.añadirProducto("Bebidas", "Zumo de naranja", 2.8, 25);
        catalogo.añadirProducto("Bebidas", "Agua mineral", 0.9, 100);
        catalogo.añadirProducto("Lácteos", "Leche", 1.1, 70);
        catalogo.añadirProducto("Lácteos", "Yogur", 0.5, 0);
        catalogo.añadirProducto("Snacks", "Chips", 1.8, 30);
        catalogo.añadirProducto("Snacks", "Chocolate", 2.3, 10);
        catalogo.añadirProducto("Snacks", "Frutos secos", 11.5, 5);

        catalogo.mostrarPorCategoria();
        catalogo.filtrarStockPositivo("Bebidas", 4);
        catalogo.buscarPorNombreParcial("Snacks","Chips");
        catalogo.ordenarPorPrecioAscendente("Snacks");
        catalogo.agruparPorRangoDePrecio("Frutas");
    }

}

