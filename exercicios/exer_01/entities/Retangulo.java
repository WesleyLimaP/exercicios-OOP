package exercicios.exer_01.entities;

public class Retangulo {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double peimeter(){
        return 2 * (width + height);

    }
    public double diagonal(){
        double somaPotencias = Math.pow(width, 2) + Math.pow(height, 2);
        return  Math.sqrt(somaPotencias);
    }

    @Override
    public String toString() {
        return "area = " + area() + "\n" +
                "perimeter = " + peimeter() + "\n" +
                "diagonal = " + String.format("%.2f", diagonal()) ;
    }
}
