package Week4.Day1;

import java.util.ArrayList;
import java.util.Iterator;

public class DAO {

    // El DAO nos permite realizar las operaciones básicas con una base de datos,
    // sin necesidad de realizar las consultas con lenguaje SQL
    // Por lo que podemos seguir el método CRUD : Read, Update, Delete, Post

    // Se trata de una clase que solo necesitamos instanciar 1 sola vez
    // por eso vamos a emplear el patrón Singleton

    private static int contadorId= 0;
    private static DAO instancia;
    // Esta lista vaa simular la base de datos sobre la que vamos a operar
    private static ArrayList<Producto> baseDeDatos;

    private DAO(){
        baseDeDatos = new ArrayList<>();
        rellenarBaseDatos();
    }

    public static DAO getInstancia(){
        if (instancia == null){
            instancia =  new DAO();
        }
        return instancia;
    }

    private static void rellenarBaseDatos() {
        baseDeDatos.add(new Producto("Plátanos", 1.45));
        baseDeDatos.add(new Producto("Manzanas", 2.10));
        baseDeDatos.add(new Producto( "Naranjas", 1.35));
        baseDeDatos.add(new Producto("Arroz", 0.95));
        baseDeDatos.add(new Producto( "Pasta", 0.80));
        baseDeDatos.add(new Producto("Leche", 0.99));
        baseDeDatos.add(new Producto( "Pan Integral", 1.20));
        baseDeDatos.add(new Producto( "Tomates", 2.35));
        baseDeDatos.add(new Producto( "Cebollas", 1.10));
        baseDeDatos.add(new Producto( "Zanahorias", 1.00));
        baseDeDatos.add(new Producto("Avena", 1.70));
        baseDeDatos.add(new Producto("Aceite de oliva", 3.50));
        baseDeDatos.add(new Producto( "Huevos (12 unidades)", 2.80));
        baseDeDatos.add(new Producto( "Lechuga", 0.75));
        baseDeDatos.add(new Producto("Pepinos", 0.90));
        baseDeDatos.add(new Producto( "Espinacas", 1.50));

    }

    // Métodos CRUD para trabajar con la base de datos

    public void addProduct(Producto producto){
        if (existProductByIdAndName(producto)){
            System.err.println("ERROR :/, ya existe un producto con id = " + producto.getId() + " y nombre = " + producto.getName());
        }else {
            producto.setId(contadorId++); // Asigna un ID único
            baseDeDatos.add(producto);
            System.out.println("Producto añadido con éxito ;)");
        }
    }

    public Producto getProductoById(int id){
        if(!existProductById(id)) {
            System.err.println("ERROR :/, no existe ningún producto con ID = " + id);
            return null;
        }
        return extractProduct(id);
    }

    public ArrayList<Producto> getAllProducts(){
        return new ArrayList<>(baseDeDatos);
    }

    public void updateProduct(Producto producto){
        if (!existProductByIdAndName(producto)){
            System.err.println("ERROR :/, no existe un producto con id = " + producto.getId() + " y nombre = " + producto.getName());
        }else {
            editProduct(producto.getName(), producto.getPrice());
            System.out.println("Actualización exitosa ;)");
        }
    }

    public void deleteProductByName(String name){
        if (!existProductByName(name)){
            System.err.println("ERROR :/, no existe un producto con nombre = " + name);
        }else {
            removeProduct(name);
            System.out.println("Producto [ " + name + " ] eliminado con éxito ;) ");
        }
    }

    // Métodos de apoyo
    private boolean existProductByIdAndName(Producto newProduct){

        for (Producto producto : baseDeDatos){
            if (producto.getId() == newProduct.getId() && producto.getName().equalsIgnoreCase(newProduct.getName())){
                return  true;
            }
        }

        return false;
    }
    private boolean existProductById(int id){

        for (Producto producto : baseDeDatos){
            if (producto.getId() == id){
                return  true;
            }
        }

        return false;
    }
    private boolean existProductByName(String name){

        for (Producto producto : baseDeDatos){
            if (producto.getName().equalsIgnoreCase(name)){
                return  true;
            }
        }

        return false;
    }
    private Producto extractProduct(int id){
        Producto producto = null;

        for (Producto productoBase : baseDeDatos){
            if (productoBase.getId() == id) producto = productoBase;
        }

        return producto;
    }
    private void editProduct(String name, double price){
        for (Producto producto : baseDeDatos){
            if (producto.getName().equalsIgnoreCase(name)) {
                producto.setName(name);
                producto.setPrice(price);
            }
        }

    }
    private void removeProduct(String name){
        Iterator<Producto> iterator = baseDeDatos.iterator();

        while (iterator.hasNext()){
            Producto producto = iterator.next();

            if (producto.getName().equalsIgnoreCase(name)){
                iterator.remove();
            }
        }
    }
}
