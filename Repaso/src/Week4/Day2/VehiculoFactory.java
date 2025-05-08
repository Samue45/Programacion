package Week4.Day2;

public class VehiculoFactory {
    public static Vehiculo fabricarVehiculo(String tipo){
        String tipoVehiculo = tipo.toLowerCase().trim();

        switch (tipoVehiculo){
            case "coche" :
                return new Coche(4,4,4);
            case "moto" :
                return new Moto(2,2);
            case "bici" :
                return new Bici(2,2);
            default:
                throw new IllegalArgumentException("El vehículo ingresado no es válido");
        }
    }
}
