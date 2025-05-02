package Week1.Day1.BasicLevel;

import java.util.Arrays;
import java.util.Random;

public class Basic {
    private int[] enteros;
    private Random random;

    public Basic(){
        enteros = new int[5];
        random = new Random();
    }

    public void rellenarArrayAleatorio(){
        for(int i = 0; i < enteros.length; i++){
            enteros[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(enteros));
    }

    public void rellenarArray(){
        int counter = 1;

        for(int i = 0; i < enteros.length; i++){
            enteros[i] = counter;
            counter++;
        }
        System.out.println(Arrays.toString(enteros));
    }

    public void Texto(){
        StringBuilder texto = new StringBuilder("Samuel");
        texto.append("Ayllón");
        texto.reverse();
        System.out.println(texto);
    }
}
