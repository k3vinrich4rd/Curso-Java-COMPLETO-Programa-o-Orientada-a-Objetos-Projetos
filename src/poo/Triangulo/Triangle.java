package poo.Triangulo;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double perimetroTriangulo = (a + b + c) / 2.0;
        return Math.sqrt(perimetroTriangulo * (perimetroTriangulo - a) * (perimetroTriangulo - b) * (perimetroTriangulo - c));
    }
}
