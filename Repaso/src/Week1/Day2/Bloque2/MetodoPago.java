package Week1.Day2.Bloque2;

public abstract class MetodoPago {
    private String titular;


    public MetodoPago(String titular) {
        this.titular = titular;
    }

    public abstract void pagar(double cantidad);

    public void imprimirRecibo(){
        System.out.println("Pago procesado para " + titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
