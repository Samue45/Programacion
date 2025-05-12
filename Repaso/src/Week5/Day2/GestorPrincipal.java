package Week5.Day2;

import java.util.HashMap;
import java.util.TreeMap;

public class GestorPrincipal {

    private HashMap<Integer, Producto> productosPorCodigo;
    private TreeMap<String, Producto> productosPorNombre;
    private TreeMap<Double, Producto> productosPorPrecio;
    private static int code;

    public GestorPrincipal() {
        productosPorCodigo = new HashMap<>();
        productosPorNombre = new TreeMap<>();
        productosPorPrecio = new TreeMap<>();
        code = 0;

    }

    public void addProduct(String nombre, double precio,int stock){
        Producto producto = new Producto(code,nombre,precio,stock);

        addProductoByCode(producto);
        addProductoByName(producto);
        addProductoByPrice(producto);

        code++;
    }


    private void addProductoByCode(Producto producto){
        if (!existProductByCodigo(producto.getCodigo())){
            System.err.println("ERROR :/, ya exite un producto con código " + code);
            throw new IllegalArgumentException("Ya existe un producto con id " + code);
        }else {
            productosPorCodigo.put(producto.getCodigo(), producto);
        }
    }
    private void addProductoByName(Producto producto){
        if (existProductByName(producto.getNombre())){
            System.err.println("ERROR :/, ya exite un producto con nombre " + producto.getNombre());
            throw new IllegalArgumentException("Ya existe un producto  con nombre " + producto.getNombre());
        }else {
            productosPorNombre.put(producto.getNombre(), producto);
        }
    }
    private void addProductoByPrice(Producto producto){
        if (existProductByPrice(producto.getPrecio())){
            System.err.println("ERROR :/, ya exite un producto con precio " + producto.getPrecio());
            throw new IllegalArgumentException("Ya existe un producto  con precio " + producto.getPrecio());
        }else {
            productosPorPrecio.put(producto.getPrecio(), producto);
        }
    }

    private boolean existProductByCodigo(int code){
        return productosPorCodigo.containsKey(code);
    }


    private boolean existProductByName(String name){
        return productosPorNombre.containsKey(name);
    }


    private boolean existProductByPrice(double price){
        return productosPorPrecio.containsKey(price);
    }
}
