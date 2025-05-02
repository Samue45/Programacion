package Week2.Day4;

public class Pajaro extends SerVivo implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public String respirar() {
        return "Soy "+ super.getNombre()  +"un pájaro que está respirando";
    }

    @Override
    public String volar() {
        return "Soy "+ super.getNombre()  +"Estoy volando";
    }
}
