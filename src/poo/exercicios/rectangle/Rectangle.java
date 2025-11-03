package poo.exercicios.rectangle;

public class Rectangle {

    public double width;
    public double height;


    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        double somaDasMedidas = Math.pow(height, 2) + Math.pow(width, 2);
        return Math.sqrt(somaDasMedidas);
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", area()) +
                "\nPERIMETER = " + String.format("%.2f", perimeter()) +
                "\nDIAGONAL = " + String.format("%.2f", diagonal());
    }


}
