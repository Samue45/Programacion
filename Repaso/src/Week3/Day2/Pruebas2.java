package Week3.Day2;

import java.util.ArrayList;
import java.util.Optional;

public class Pruebas2 {

    public void p1(){
        Operation operation = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Suma = " + operation.operation(4,4));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int number = numbers.stream().map(numbList -> numbList + 1)
                .filter(nu -> nu > 5)
                .reduce(0,(a, b) -> a + b);

        System.out.println( "Resultado de usar stream con la lista = " + number);
    }

    public void p2(){
        ArrayList<String> arrayListNombres = new ArrayList<>();
        arrayListNombres.add("Juan");
        arrayListNombres.add("Ana");
        arrayListNombres.add("Paco");
        arrayListNombres.add("Isma");
        arrayListNombres.add("Samuel");
        arrayListNombres.add("Antonio");
        arrayListNombres.add("anastasia");
        arrayListNombres.add("Abel");




        arrayListNombres.stream().filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
        //tanto collect como foreach son funciones terminales y cortan el flujo de los streams
    }

    public void p3(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

       int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
               .reduce(0,(a,b) -> a + b);

        System.out.println(" Resultado de sumar todos los números de la lista = " + sum);
    }
}
