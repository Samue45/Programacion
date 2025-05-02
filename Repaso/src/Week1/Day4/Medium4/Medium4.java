package Week1.Day4.Medium4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medium4 {
    public static void medium(){
        LocalDate fecha1 = LocalDate.of(2005,5,8);
        LocalDate fecha2 = LocalDate.now();

        LocalDate miEdad1 = LocalDate.ofEpochDay(ChronoUnit.YEARS.between(fecha2,fecha1));
        int miEdad2 = fecha2.getYear() - fecha1.getYear();
        System.out.println("Tengo " + miEdad1.getYear() + " años");
        System.out.println("Tengo " + miEdad2 + " años");
    }

    public static void knowDay(LocalDate fecha){
        System.out.println(fecha.getDayOfWeek());
    }
}
