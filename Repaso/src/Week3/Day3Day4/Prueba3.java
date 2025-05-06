package Week3.Day3Day4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Prueba3 {
    ArrayList<String> arrayList = new ArrayList<>();
    public void easy(){


        arrayList.add("Manuel");
        arrayList.add("manolo");
        arrayList.add("Abel");
        arrayList.add("Antonio");
        arrayList.add("Pepe");
        arrayList.add("andoni");
        arrayList.add("Pepe");
        arrayList.add("Manuel");
        arrayList.add("manolo");
        arrayList.add("María");

        arrayList.stream()
                .filter(name -> name.toLowerCase().startsWith("m"))
                .distinct()
                .sorted()
                .forEach(name -> System.out.println("Nombre = " + name));



    }

    public void medium(){
        ArrayList<String> nombres3 = (ArrayList<String>) arrayList.stream().limit(3).peek(e -> System.out.println("Lista limitada a 3 " + e)).toList();
        ArrayList<String> nombresMenos5 = (ArrayList<String>) arrayList.stream().skip(5).peek(e -> System.out.println("Lista menos 5 nombres  " + e)).toList();
        String nombres = arrayList.stream().map(name -> name.toUpperCase()).peek(e -> System.out.println("Lista a mayúsculas " + e)).collect(Collectors.joining(" | "));

        System.out.println(nombres3 + "\n" + nombresMenos5 + "\n" + nombres + "\n");

    }

    public void hard(){
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Paco",12));
        personas.add(new Persona("Paco", 12));
        personas.add(new Persona("Ana", 19));
        personas.add(new Persona("Luis", 21));
        personas.add(new Persona("María", 17));
        personas.add(new Persona("Jorge", 21));
        personas.add(new Persona("Sofía", 16));
        personas.add(new Persona("Elena", 22));
        personas.add(new Persona("Carlos", 18));
        personas.add(new Persona("Lucía", 17));
        personas.add(new Persona("Pedro", 19));
        personas.add(new Persona("Laura", 22));
        personas.add(new Persona("Dani", 19));

        personas.stream()
                .filter(persona -> persona.getAge() >= 18)
                .map(persona -> {
                    persona.getName().toUpperCase();
                    persona.getAge();
                    return persona;
                })
                .forEach(persona -> System.out.println("Nombre " + persona.getName() + " Edad " + persona.getAge()));

    }
}
