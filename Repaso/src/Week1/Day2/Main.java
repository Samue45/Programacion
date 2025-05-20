package Week1.Day2;

import Week1.Day2.Bloque1.Persona;
import Week1.Day2.Bloque2.MetodoPago;
import Week1.Day2.Bloque2.PayPal;
import Week1.Day2.Bloque2.TarjetaCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
day2();
    }

    public static void day2(){
        block1();
        block2();
    }

    public static void block1(){
        ArrayList<Persona> listPersonas = new ArrayList<>();
        listPersonas.add(new Persona("Paco",20,"Jerez de la Frontera"));
        listPersonas.add(new Persona("María",45,"Asturín"));
        listPersonas.add(new Persona("Juan",12,"Jerez de la Frontera"));
        listPersonas.add(new Persona("Lucas",22,"Jerez de la Frontera"));
        listPersonas.add(new Persona("Carol",19,"Jerez de la Frontera"));
        listPersonas.add(new Persona("Lucía",10,"Jerez de la Frontera"));

        listPersonas.stream()
                .filter(persona -> persona.getEdad() > 18)
                .map(persona -> new Persona(persona.getNombre().toUpperCase(), persona.getEdad(), persona.getCiudad()))
                .forEach(persona -> System.out.println(persona.toString()));

        List<Persona> listaModificadaPersonas = listPersonas.stream()
                .filter(persona -> persona.getEdad() > 18)
                .map(persona -> new Persona(persona.getNombre().toUpperCase(), persona.getEdad(), persona.getCiudad()))
                .collect(Collectors.toList());

        for (Persona personaM : listaModificadaPersonas){
            System.out.println("Persona ( " + personaM.getNombre() + " - " + personaM.getEdad() + " años - " + personaM.getCiudad());

        }
    }
    public static void block2(){
        List<MetodoPago> metodos = new ArrayList<>();

        metodos.add(new TarjetaCredito("Juan Pérez", "1234-5678-9012-3456", "123"));
        metodos.add(new PayPal("María","maria.lopez@gmail.com"));
        metodos.add(new TarjetaCredito("Carlos Ruiz", "9876-5432-1098-7654", "456"));
        metodos.add(new PayPal("Lucas","lucas99@hotmail.com"));

        for (MetodoPago metodoPago: metodos){
            metodoPago.pagar(80);
            metodoPago.imprimirRecibo();
        }

    }
}
