package Week1.Day4.Hard4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Hard4 {
    private Scanner input;

    public Hard4(){
        input = new Scanner(System.in);
    }

    public void calcularMiEdad(){
        System.out.println("Ingresa tu fecha de nacimiento");
        System.out.print("Año = ");
        int year = input.nextInt();

        System.out.print("Mes = ");
        int month = input.nextInt();

        System.out.print("Día = ");
        int day = input.nextInt();

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaUser = LocalDate.of(year,month,day);

        int edad = fechaActual.getYear() - fechaUser.getYear();
        int days = Math.toIntExact(ChronoUnit.DAYS.between(fechaUser,fechaActual));

        System.out.println(" Tu edad es = " + edad + "\n Has vivido " + days + " días");
    }
}
