package Week4.Day2;

public class Moto extends Vehiculo implements IVehiculo {


    public Moto(int numberRuedas, int numberLuces) {
        super(numberRuedas,numberLuces);
    }

    @Override
    public void conducir(){
        System.out.println("Estoy conduciendo una moto");
    }
}
