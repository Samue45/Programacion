package Week2.Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class CentroAdopcion {

    private ArrayList<Animal> refugio;

    public CentroAdopcion(){
        this.refugio = new ArrayList<>();
    }

    public void admitirAnimal(Animal animal){
        refugio.add(animal);
    }

    public void mostrarTodos(){
        Iterator<Animal> iterator = refugio.iterator();
        StringBuilder mensaje = new StringBuilder();

        mensaje.append("Lista de animales \n");

        while (iterator.hasNext()){
            Animal animal = iterator.next();
            mensaje.append("Animal ").append(" [ ").append(animal.toString()).append(" ]\n");
        }

        System.out.println(mensaje);
    }

    public Animal searchAnimal(String nombre){
        for (int i = 0; i < refugio.size(); i++) {
            if (refugio.get(i).getNombre().equalsIgnoreCase(nombre)){
                return refugio.get(i);
            }
        }
        return  null;
    }

    public void contarTipoAnimal(){
        int counterPerro = 0, counterGato = 0, counterLoro = 0, counterConejo = 0;

        Iterator<Animal> iterator = refugio.iterator();

        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal instanceof Perro){
                counterPerro++;
            }
            if (animal instanceof Gato){
                counterGato++;
            }
            if (animal instanceof Loro){
                counterLoro++;
            }
            if (animal instanceof Conejo){
                counterConejo++;
            }

        }

        System.out.println("Perros (" + counterPerro + ")" +"Gatos (" + counterGato + ")" + "Loros (" + counterLoro + ")"+ "Conejos (" + counterConejo + ")");
    }
}
