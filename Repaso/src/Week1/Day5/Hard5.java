package Week1.Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Hard5 {
    private ArrayList<String> listNames;

    public Hard5(){
        listNames = new ArrayList<>();
        rellenarLista();
    }

    private void rellenarLista(){
        listNames.add("Juan");
        listNames.add("ana");
        listNames.add("antonia");
        listNames.add("Ismael");
        listNames.add("Paco");
        listNames.add("Andoni");
        listNames.add("Samuel");
    }

    public void deleteNameStartVocal(){

        Iterator<String> iterator = listNames.iterator();
        while (iterator.hasNext()){
            String name = iterator.next().toLowerCase();
            if (name.charAt(0)== 97 || name.charAt(0) == 101 || name.charAt(0) == 105|| name.charAt(0) == 117|| name.charAt(0) == 111) iterator.remove();
        }
    }

    public void showList(){
        Iterator<String> iterator = listNames.iterator();

        System.out.println(" ");
        while (iterator.hasNext()){
            System.out.print( " | " + iterator.next());
        }
    }
}
