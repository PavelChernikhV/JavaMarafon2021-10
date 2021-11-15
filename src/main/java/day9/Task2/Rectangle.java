package day9.Task2;

public class Rectangle extends Figure{
    private double wight, height;

    public Rectangle(double wight, double height, String color){
        super(color);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double area() {
        return wight * height;
    }

    @Override
    public double perimeter() {
        return (height + wight) * 2;
    }
}
