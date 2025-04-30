package Week2.Day3;

public class Rectangulo extends Figura{
    private double height;
    private double width;

    public Rectangulo(double height, double width) {
       this.height = height;
       this.width = width;
    }

    @Override
    public double calcularArea() {
        return height * width;
    }
}
