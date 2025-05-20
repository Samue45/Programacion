package Week1.Day2.Bloque2;

public class PayPal extends MetodoPago{
   private String email;

    public PayPal(String titular, String email) {
        super(titular);
        this.email = email;
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("Se ha realizado el pago mediante correo valorado en " + cantidad);
        //Sería un método que guardaría los datos en una base de datos
    }
}
