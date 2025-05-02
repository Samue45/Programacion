package Week1.Day2.Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class Hard2 {
    private Scanner input;
    private ArrayList<String> listaNames;

    public Hard2(){
        input = new Scanner(System.in);
        listaNames = new ArrayList<>();
    }

    public void reto(){
        String mensaje = "";
        String info = "Ingrese un nombre para guardar";
        System.out.println("Si ingresa un nombre se guarda y si ingresa salir se muestra la lista de nombres");
        do{
            System.out.println(info);
            mensaje = input.next();

            if (!mensaje.toLowerCase().equals("salir")){
                addNames(mensaje);
            }
        }while(!mensaje.toLowerCase().equals("salir"));
        mostrarNames();
    }

    public void addNames(String name){
        listaNames.add(name);
    }

    public void mostrarNames(){
        StringBuilder mensaje = new StringBuilder("Los nombres de la lista son = ");
        for (String name : listaNames){
            mensaje.append("[ ").append(name).append(" ]");
        }
        System.out.println(mensaje);
    }


}
