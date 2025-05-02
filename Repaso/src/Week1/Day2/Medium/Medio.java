package Week1.Day2.Medium;

import java.util.ArrayList;


public class Medio {

    private ArrayList<String> listaNombres;

    public Medio(){
        listaNombres = new ArrayList<>();
        listaNombres.add("Antonia");
        listaNombres.add("José");
        listaNombres.add("Paco");
        listaNombres.add("Ana");
    }

    public void invertirOrden(){
        for(int i = listaNombres.size()- 1; i >= 0; i--){
            System.out.println(listaNombres.get(i));
        }
    }
    public void normalOrden(){
        for(String name: listaNombres){
            System.out.println(name);
        }
    }

    public int knowSize(ArrayList<Integer> lista){
        return lista.size();
    }

    public Integer[] parseArrayListToArray(ArrayList<Integer> arrayList){
        return arrayList.toArray(new Integer [5]);
    }
}
