package Week1.Day1.MediumLevel;

public class Medium {


    public int sumarNumbers(int[] numbers){
        int suma = 0;

        for (int number : numbers){
            suma += number;
        }

        return suma;
    }

    public void palindromo(String palabra){
        StringBuilder palindromo = new StringBuilder(palabra);
        palindromo.reverse();
        System.out.println(palindromo);
    }
}
