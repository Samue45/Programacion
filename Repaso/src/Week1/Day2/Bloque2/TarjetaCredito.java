package Week1.Day2.Bloque2;


public class TarjetaCredito extends MetodoPago{
    private String numberTarjeta;
    private String cvv;

    public TarjetaCredito(String titular, String numberTarjeta, String cvv) {
        super(titular);
        this.numberTarjeta = numberTarjeta;
        this.cvv = cvv;
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("Se ha realizado el pago mediante tarjeta valorado en " + cantidad);
        //Sería un método que guardaría los datos en una base de datos
    }
}
