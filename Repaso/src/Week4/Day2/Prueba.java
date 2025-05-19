package Week4.Day2;


import java.util.List;

public class Prueba {

    public void prueba(){
        //Creamos los vehículos
        Vehiculo coche1 = VehiculoFactory.fabricarVehiculo("coche");
        Vehiculo moto1 = VehiculoFactory.fabricarVehiculo("moto");
        Vehiculo coche2 = VehiculoFactory.fabricarVehiculo("Coche  ");
        Vehiculo bici1 = VehiculoFactory.fabricarVehiculo("BICI  ");


        List<Vehiculo> concesionario = List.of(coche1,coche2,moto1,bici1);

        for(Vehiculo vehiculo : concesionario){
            if (vehiculo instanceof Coche){
                ((Coche) vehiculo).conducir();
            }else if (vehiculo instanceof Moto){
                ((Moto) vehiculo).conducir();
            } else if (vehiculo instanceof  Bici) {
                ((Bici) vehiculo).conducir();
            }
        }
    }
}
