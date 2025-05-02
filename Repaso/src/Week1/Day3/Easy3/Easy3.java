package Week1.Day3.Easy3;

public class Easy3 {

    public static void imprimirNumbers(int number){
        // Caso base que rompe el bucle
        if (number <= 0) return;
        System.out.print(number + " | ");
        // Llamada recursiva que hace continuar el bucle
        imprimirNumbers(number - 1);
        //Código que se ejecutará cuando se interrumpa la llamada recursiva
        System.out.print(number + " | ");
        // En este caso imprimirá del menor al mayor, si lo hiciera antes de la llamada recursiva sería al revés
    }

    public static int contarHasta0(int number){
        //Caso base
        if (number == 0) return 0;
        // Llamada recursiva, que va llegando hasta 0
        return contarHasta0(number - 1) + 1;
    }
}
