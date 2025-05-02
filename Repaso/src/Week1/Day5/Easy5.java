package Week1.Day5;

import java.util.ArrayList;

public class Easy5 {

   public static void easy (){
       ArrayList<Boolean> semana = new ArrayList<>();
       semana.add(Dia.LUNES.esDiaLaborable());
       semana.add(Dia.MARTES.esDiaLaborable());
       semana.add(Dia.MIERCOLES.esDiaLaborable());
       semana.add(Dia.JUEVES.esDiaLaborable());
       semana.add(Dia.VIERNES.esDiaLaborable());
       semana.add(Dia.SABADO.esDiaLaborable());
       semana.add(Dia.DOMINGO.esDiaLaborable());

       for (boolean dia : semana){
           System.out.println("Día laborable = " + dia);
       }

   }

}
