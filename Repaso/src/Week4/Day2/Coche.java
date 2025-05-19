package Week4.Day2;

public  class Coche extends Vehiculo implements IVehiculo{

    private int puertas;

    public Coche(int numberRuedas, int numberLuces , int puertas) {
        super(numberRuedas,numberLuces);
        this.puertas = puertas;
    }

    @Override
    public void conducir(){
        System.out.println("Estoy conduciendo un coche");
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
