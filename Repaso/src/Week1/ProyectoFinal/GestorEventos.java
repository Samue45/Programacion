package Week1.ProyectoFinal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorEventos {

    private ArrayList<Persona> personaArrayList;

    public GestorEventos(){
        this.personaArrayList = new ArrayList<>();
    }

    public void  saveDataPerson(String name, int year, int month, int day){
        // 1º Comprobamos si existe la persona
        if (!existPerson(name,year,month,day)){
            // 2º Creamos la persona
            FechaNacimiento dateBirthday = new FechaNacimiento(year,month, day);
            Persona newPerson = new Persona(name, dateBirthday);

            // 3º Guardamos a la persona
            personaArrayList.add(newPerson);

            // 4º Mensaje de exito
            System.out.println("Se ha guardado con éxito");
        }else {
            System.err.println("ERROR :/, la persona ya existe");
        }
    }

    public void  watchAllPeople(){
        StringBuilder mensaje = new StringBuilder();

        for (Persona persona : personaArrayList){
            mensaje.append("Nombre : ").append(persona.getName()).append(" Fecha nacimiento").append(persona.getFechaNacimiento().toString()).append("\n");
        }

        System.out.println("Listado de todas las personas : \n" + mensaje);
    }

    public void deletePeson(String name, int year, int month, int day){
        Iterator<Persona> iterator = personaArrayList.iterator();

        while (iterator.hasNext()){
            Persona persona = iterator.next();
            if (existPerson(name,year,month,day)){
                iterator.remove();
            }else {
                System.err.println("ERRROR :/ , no existe " + persona.toString() );
            }

        }
    }

    private boolean existPerson(String name, int year, int month, int day){
        for (Persona person : personaArrayList){
            if (person.getName().equals(name) && person.getFechaNacimiento().getFecha().getYear() == year && person.getFechaNacimiento().getFecha().getMonth().equals(month) && person.getFechaNacimiento().getFecha().getDayOfMonth() == day){
                return  true;
            }
        }
        return false;
    }

    public void deleteNameStartByVocal(){
        Iterator<Persona> iterator = personaArrayList.iterator();
        int counter = 0;

        while (iterator.hasNext()){
            Persona persona = iterator.next();
            String name = persona.getName().toLowerCase();
            if (name.startsWith("a") ||name.startsWith("e") ||name.startsWith("i") ||name.startsWith("o") ||name.startsWith("u")){
                iterator.remove();
                counter++;
            }
        }

        System.out.println("Había " + counter + " que empezaban por vocal");
    }

    public void daysByBirthday(String name, int year, int month, int day){
        for (Persona persona : personaArrayList) {
            if (persona.getName().equalsIgnoreCase(name)) {
                LocalDate birthdayThisYear = persona.getFechaNacimiento().getFecha()
                        .withYear(LocalDate.now().getYear());

                if (birthdayThisYear.isBefore(LocalDate.now())) {
                    birthdayThisYear = birthdayThisYear.plusYears(1);
                }

                long dias = ChronoUnit.DAYS.between(LocalDate.now(), birthdayThisYear);
                System.out.println("Faltan " + dias + " días para el cumpleaños de " + name);
                return;
            }
        }

        System.err.println("No existe la persona.");
    }

    public void dayWeekBirthday(String name, int year, int month, int day){
        DayOfWeek dayWeek ;
        StringBuilder mensaje = new StringBuilder();



        for (int i=0; i < personaArrayList.size(); i++){
            if (!existPerson(name,year, month,day)){
                System.err.println("ERROR :/, No existe dicha persona");
                return;
            }else {
                Persona persona = personaArrayList.get(i);
                dayWeek = persona.getFechaNacimiento().getFecha().getDayOfWeek();

                mensaje.append("El cumpleaños de ").append(persona.getName()).append(" cae en ").append(dayWeek).append(" y es un día").append(DiaSemana.valueOf(String.valueOf(dayWeek)));
            }
        }

        System.out.println(mensaje);
    }
}
