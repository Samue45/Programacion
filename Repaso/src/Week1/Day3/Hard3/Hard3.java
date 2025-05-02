package Week1.Day3.Hard3;



public class Hard3 {

    public static int sumarNumbersArray(int index , int[] arrayNumbers){
        // Caso base que va a inicializar la suma
        if (index <= 0) return 0;
        // Llamada recursiva donde se suma el número de la posición actual + el siguiente
        // La suma se haría cuando el bucle sea interrumpido y el método devuelva 0
        return arrayNumbers[index - 1] + sumarNumbersArray(index - 1, arrayNumbers);
    }

    public static void invertirString(String palabra, int contador){
        // Al hacer una llamada recursiva avanzamos, por lo tanto debemos imprimir cuando se termine la llamada recursiva y vaya hacia atrás
        //Caso base: Cuando termine de recorrer la palabra
        if (contador >= palabra.length()) return;
        // Llamada recursiva
        invertirString(palabra, contador + 1);
        System.out.print(palabra.charAt(contador));
    }

}
