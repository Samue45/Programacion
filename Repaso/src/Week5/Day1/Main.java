package Week5.Day1;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static SistemaGestorPedidos gestorPedidos = new SistemaGestorPedidos();

    public static void main(String[] args) {
        consola();
    }

    public static void consola(){
        int salir = 0;
        int respuesta;
        String cliente, nombrePedido;

        StringBuilder instrucciones = new StringBuilder();
        instrucciones.append("Para poder usar el gestor de pedidos tiene los siguientes controles\n")
                .append("0 - Salir del gestor de pedidos\n")
                .append("1 - Para agregar un producto\n")
                .append("2 - Para preparar un pedido\n")
                .append("3 - Para terminar un pedido\n")
                .append("4 - Para ver cómo van los pedidos\n");

        System.out.println(instrucciones);

        do {
            System.out.println("Ingresa que operación desea realizar : ");
            respuesta = input.nextInt();

            switch(respuesta){
                case 0 :
                    System.out.println("Cerrando panel de control");
                    salir = 1;
                    break;
                case 1:
                    System.out.println("Ingresa tu nombre de cliente");
                    cliente = input.next();
                    System.out.println("Ingresa el nombre del producto");
                    nombrePedido = input.next();

                    gestorPedidos.addPedido(cliente,nombrePedido);
                    System.out.println("Pedido solicitado con éxito :)");
                    break;
                case 2:
                    System.out.println("Preparando pedido");
                    gestorPedidos.moveToPreparation();
                    System.out.println("Actualmente su pedido está siendo procesado");
                    break;
                case 3:
                    System.out.println("Entregar pedido");
                    gestorPedidos.endPedido();
                    System.out.println("Su pedido ha sido entregado");
                    break;
                case 4:
                    System.out.println("Cargando datos de los pedidos");
                    gestorPedidos.mostrarEstadoActual();
                    break;
                default:
                    throw new IllegalArgumentException("ERROR :/, opción no válida");
            }
        }while (salir != 1);
    }
}
