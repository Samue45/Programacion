package Week2.Day3;

public class Triangulo extends Figura{
    private double height;
    private double width;

    public Triangulo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcularArea() {
        return height * width * 0.5;
    }
}
