package Week4.Day1;

public class Prueba {

    public void prueba(){
        // Obtenemos la instancia de la base de datos
        DAO baseDatos = DAO.getInstancia();


        //Añadir producto
        baseDatos.addProduct(new Producto("Plátanos",1.45));
        baseDatos.addProduct(new Producto("Yogur Soja",1));

        //Obtener por ID
        baseDatos.getProductoById(18);

        //Obtener todos
        System.out.println("Lista de productos");
        for (Producto producto: baseDatos.getAllProducts()){
            System.out.println("Nombre = " + producto.getName() + "Precio = " + producto.getPrice());
        }

        //Actualizar producto
        baseDatos.updateProduct(new Producto("Pátano",2.89));

        //Eliminar producto
        baseDatos.deleteProductByName("Pepinos");

    }
}
