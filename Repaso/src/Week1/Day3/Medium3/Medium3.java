package Week1.Day3.Medium3;

import java.util.ArrayList;

public class Medium3 {

    public static int fibonacci(int number){
        //Caso base
        if (number <= 1) return number;
        //Llamada recursiva
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int factorial(int number){
        if (number <= 1) return 1;
        return number * factorial(number - 1);
    }

    public static void rellenarArrayList(int index, ArrayList<Integer> lista, int number){
        //Caso base
        if (index <= 0) return;
        //Guardamos el número en la lista antes de hacer la llamada recursiva, pero también se pude hacer depués y empezaría a guarda cuando se corte el bucle
        lista.add(number);
        //Hacemos la llamada recursiva, esto permite avanzar en la lista e ir guardando los números que se van reduciendo de 1 en 1
        rellenarArrayList(index - 1, lista, number - 1);
    }
}
