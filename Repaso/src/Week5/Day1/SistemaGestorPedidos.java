package Week5.Day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SistemaGestorPedidos {

    private Queue<Pedido> colaEspera;
    private LinkedList<Pedido> colaPreparacion;
    private ArrayList<Pedido> listaPedidosEntregados;
    private static int id;

    public SistemaGestorPedidos(){
        this.colaEspera = new LinkedList<>();
        this.colaPreparacion = new LinkedList<>();
        this.listaPedidosEntregados = new ArrayList<>();
        id = 0;
    }

    // Las estructuras para manejar datos ofrecen un método poll(), que extraer el primer elemento que hay o null si está vacía
    public void addPedido(String cliente, String nombre){
        Pedido pedido = new Pedido(cliente,nombre);
        pedido.setId(id);
        colaEspera.add(pedido);
        id++;
    }
    public void moveToPreparation(){
        if (colaEspera.isEmpty()){
            System.out.println("No hay ningún pedido en la cola de espera");
        }else {
            colaPreparacion.add(colaEspera.poll());
        }
    }
    public void endPedido(){
        if (colaPreparacion.isEmpty()){
            System.out.println("No hay ningún pedido en la cola de preparación");
        }else {
            listaPedidosEntregados.add(colaPreparacion.poll());
        }
    }
    public void mostrarEstadoActual(){
        System.out.println("----Cola de espera----");
        for (Pedido pedido : colaEspera){
            System.out.println(pedido.toString());
        }
        System.out.println("----Cola de preparación----");
        for (Pedido pedido : colaPreparacion){
            System.out.println(pedido.toString());
        }
        System.out.println("----Cola de pedidos entregados----");
        for (Pedido pedido : listaPedidosEntregados){
            System.out.println(pedido.toString());
        }
    }
}
