package Week4.Day2;

public class Bici extends Vehiculo implements IVehiculo{

    public Bici(int numberRuedas, int numberLuces) {
        super(numberRuedas, numberLuces);
    }

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo una bici");
    }
}
