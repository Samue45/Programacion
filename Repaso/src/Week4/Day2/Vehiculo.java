package Week4.Day2;

public abstract class Vehiculo {
    private int numberRuedas;
    private int numberLuces;

    public Vehiculo(int numberRuedas, int numberLuces) {
        this.numberRuedas = numberRuedas;
        this.numberLuces = numberLuces;
    }

    public int getNumberRuedas() {
        return numberRuedas;
    }

    public void setNumberRuedas(int numberRuedas) {
        this.numberRuedas = numberRuedas;
    }

    public int getNumberLuces() {
        return numberLuces;
    }

    public void setNumberLuces(int numberLuces) {
        this.numberLuces = numberLuces;
    }
}
