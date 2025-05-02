package Week1.Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Medium5 {

    private  ArrayList<Integer> list;

    public Medium5(){
        list = new ArrayList<>();
        rellenarArrayList();
    }

    private void rellenarArrayList (){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

    }

    public  void showNumbers (){

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int number = iterator.next();
            System.out.print(number);
        }
    }
    public  void deletePares (){
        Iterator<Integer> iterator = list.iterator();

        System.out.println(" ");
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number % 2 == 0) iterator.remove();
        }
    }
}
