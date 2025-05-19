package Week4.RepasoFinal;


public class ServicioFalso {
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
