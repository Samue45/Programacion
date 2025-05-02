package Week1.Day4.Easy4;

import java.time.LocalDate;

public class Easy4 {

    public static void easy(){
        //Fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual = " + fechaActual);
        //Fecha personalizada
        LocalDate fechaPersonal = LocalDate.of(2025,4,26);
        System.out.println("Fecha personalizada = " + fechaPersonal);
        //Suma 30 días a la fecha actual.
        LocalDate fechaPlus30 = fechaActual.plusDays(30);
        System.out.println("Fecha actual + 30 días = " + fechaPlus30);
    }
}
