package Week2.Day1;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {
    private ArrayList<Producto> listaProductos;

    public Carrito (){
        listaProductos = new ArrayList<>();
    }

    public void addProducto(String nombre, int stock, double price){
        listaProductos.add(new Producto(nombre, stock, price));
    }

    public double calculateTotalPriceCarrito(){
        Iterator<Producto> iterator = listaProductos.iterator();
        double totalPrice = 0;
        while (iterator.hasNext()){
            Producto producto = iterator.next();
            totalPrice += (producto.getPrice() * producto.getStock());
        }

        return totalPrice;
    }
}
