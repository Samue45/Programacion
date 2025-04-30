package Week2.Day1;

public class Medium1 {
    public void mediumLevel(){
        Producto producto1 = new Producto("Plátanos",50,1.45);
        Producto producto2 = new Producto("Manzanas",29,1.90);

        producto2.setStock(55);

        mostrarInfo(producto1);
        mostrarInfo(producto2);

    }

    private   void mostrarInfo(Producto producto){
        System.out.println(producto.toString());

    }
}
