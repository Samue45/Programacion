package Week1.Day2.Easy;

import java.util.ArrayList;

public class Easy {
    private ArrayList<String> listaNombres;

    public Easy(){
        listaNombres = new ArrayList<String>();
    }

    public void addNames(){
        String[] ejemplos = {"Manuel","Estefanía", "Paz", "Marcos"};
        for(String name : ejemplos){
            listaNombres.add(name);
        }
    }

    public void deleteName(String name){
        listaNombres.remove(name);
    }

    public void mostarNombres(){
       StringBuilder mensaje = new StringBuilder("Los nombres de la lista son : ");
        for (String name : listaNombres){
            mensaje.append("[ ").append(name).append(" ]");
        }
        System.out.println(mensaje);
    }
}
