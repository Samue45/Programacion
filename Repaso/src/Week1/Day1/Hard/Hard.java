package Week1.Day1.Hard;

public class Hard {

    public String reto (String mesaje){
        int counter = 0;
        StringBuilder newMensaje = new StringBuilder();
        for (int i=0; i < mesaje.length(); i++){
            if (mesaje.toLowerCase().charAt(i) == 'a' || mesaje.toLowerCase().charAt(i) == 'e'
                    || mesaje.toLowerCase().charAt(i) == 'i' || mesaje.toLowerCase().charAt(i) == 'o'
                    || mesaje.toLowerCase().charAt(i) == 'u' ){
                counter++;
                newMensaje.append(mesaje.charAt(i));
            }
        }
        System.out.println("Hay " + counter + " vocales");
        return newMensaje.reverse().toString();
    }
}
