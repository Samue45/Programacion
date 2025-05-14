package Week5.FinalProyect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Catalogo {

    private TreeMap<String, List<Producto>> baseCatalogo;
    private int idCounter;

    public Catalogo (){
        baseCatalogo = new TreeMap<>();
        idCounter = 0;
    }

    public void añadirProducto(String category , String nombre, double precio, int stock){
        Producto producto = new Producto(idCounter,nombre, precio,stock);
        List<Producto> listProducts;

        if (!existCategory(category)) {
            System.err.println("ERROR :/,no existe la categoría. La debe crear");
            return;
        }

        listProducts = baseCatalogo.get(category);

        if (existProduct(producto.getId(), listProducts)){
            System.err.println("ERROR :/, ya existe un producto con id " + producto.getId());
            return;
        }

        listProducts.add(producto);

        idCounter++;

    }

    public void createCategory(String category){
        baseCatalogo.put(category, new ArrayList<>());
    }

    public void mostrarPorCategoria(){
        StringBuilder mensaje = new StringBuilder();
        Iterator<String> iterator = baseCatalogo.keySet().iterator();

        mensaje.append("Lista de todas las categorías que existen");

        while (iterator.hasNext()){
            String category = iterator.next();
            mensaje.append("[ ").append(category).append(" ]");
        }

        System.out.println(mensaje);
    }

    public void filtrarStockPositivo(String category ,int stock){
        List<Producto> listProducts;

        if (!existCategory(category)) {
            System.err.println("ERROR :/,no existe la categoría. La debe crear");
            return;
        }

        listProducts = baseCatalogo.get(category);

        System.out.println("Categoría = " + category);
        listProducts.stream()
                .filter(producto -> producto.getStock() > stock)
                .forEach(producto -> System.out.println(producto.toString()));

    }

    public void buscarPorNombreParcial(String category ,String name){
        List<Producto> listProducts;

        if (!existCategory(category)) {
            System.err.println("ERROR :/,no existe la categoría. La debe crear");
            return;
        }

        listProducts = baseCatalogo.get(category);

        System.out.println("Categoría = " + category);
        listProducts.stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(name))
                .forEach(producto -> System.out.println(producto.toString()));

    }

    public void ordenarPorPrecioAscendente(String category ){
        List<Producto> listProducts;

        if (!existCategory(category)) {
            System.err.println("ERROR :/,no existe la categoría. La debe crear");
            return;
        }

        listProducts = baseCatalogo.get(category);

        System.out.println("Categoría = " + category);
        listProducts.stream()
                .sorted().forEach(producto -> producto.toString());
    }

    public void agruparPorRangoDePrecio(String category ){
        List<Producto> listProducts;

        if (!existCategory(category)) {
            System.err.println("ERROR :/,no existe la categoría. La debe crear");
            return;
        }

        listProducts = baseCatalogo.get(category);

        System.out.println("Categoría = " + category);
        System.out.println("Productos con precio menos a 5 €");
        listProducts.stream()
                .filter(producto -> producto.getPrecio() < 5)
                .forEach(producto -> System.out.println(producto.toString()));

        System.out.println("Productos con precio 5–10 €");
        listProducts.stream()
                .filter(producto -> producto.getPrecio() > 5 && producto.getPrecio() < 10)
                .forEach(producto -> System.out.println(producto.toString()));

        System.out.println("Productos con precio mayores a 10 €");
        listProducts.stream()
                .filter(producto -> producto.getPrecio() > 10)
                .forEach(producto -> System.out.println(producto.toString()));
    }


    private boolean existCategory(String category){
        return baseCatalogo.containsKey(category);
    }

    private boolean existProduct(int id, List<Producto> listProduct){
        for (Producto producto : listProduct){
            if (producto.getId() == id) return true;
        }
        return false;
    }
}
