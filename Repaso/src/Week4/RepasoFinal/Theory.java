package Week4.RepasoFinal;

public class Theory {

    //🔹 1️⃣ Explica en una línea qué es el Patrón DAO.
    // Se trata de una clase que se encarga de manejar toda la lógica responsable de hacer peticiones SQL a una base de datos

    //🔹 2️⃣ ¿Para qué sirve el Patrón Singleton? ¿Cómo se implementa?
    // Sirve para que una clase solo se pueda instancia 1 sola vez
    /*
    * public class ServicioFalso {
   // Se define una propiedad que solo pertenece a la clase y va a contener la única instancia
    private static ServicioFalso instanciaServicio;
  // El constructor es privado, para evitar que puedan crear instancias de esta clase desde fuera
    private ServicioFalso(){}

    // Ofrecemos un método público para obtener la instacia del servicio
    // Si no existe,se crea , se guarda en la variable y le retornamos su valor
    public ServicioFalso getInstanciaServicio(){
        if (instanciaServicio == null){
            instanciaServicio = new ServicioFalso();
        }
        return instanciaServicio;
    }

    // De este modo evitamos la instanciación innecesaria de una clase que siempre hace lo mismo
}
    *
    *
    * */

    //🔹 3️⃣ ¿Cuál es la ventaja del Patrón Factory sobre un new directo?
    // El patrón factory nos permite crear objetos sin necesidad de saber su tipo de dato ni de emplear la palabra especial new
    // Básicamente, podemos crear una clase que actúa como una fábrica y nos permite instanciar objetos de un tipo de dato
    // de forma más rápida y cómoda

    //🔹 4️⃣ ¿Qué imprime el siguiente código?
    //Vehiculo coche = VehiculoFactory.fabricarVehiculo("coche");
    //coche.conducir();

    // Tenemos una variable de tipo vehículo, es una clase abstracta con propiedades y métodos generales
    // Unos de esos métodos es conducir y está siendo sobreescrito es la clase hija Coche que extiende de vehículo
    // Además, para crear la instancia de Vehículo estamos empleando el patrón Factory, no necesitamos usar new ni pasar parámetros
    // tan solo hacemos uso de Factory y le pasamos un string indicando el tipo de vehículo que queremos instanciar
    // Al final se imprime en consola un mensaje que ha sido sobreescrito en la clase Coche


    //🔹 5️⃣ ¿Qué pasa si en el Factory pides un tipo no válido?
    // Internamente, emplea una estructura condicional para manejar la instanciación de objeto
    // En este caso, un switch que recibe el dato string. En caso, de ser el valor default se ejecutará el código
    // que haya escrito en ese código, este suele ser un mensaje de error para advertir de que el parámetro pasado no es válido

}

