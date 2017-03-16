abstract class Shape extends Object
{
    public abstract double getArea();
}

class Circle extends Shape
{
    private double _width;
    private double _height;

    public Circle(double w, double h)
    {
        _width = w;
        _height = h;
    }

    public double getArea() { return _width * _height; }
}

class Square extends Circle
{
    public Square(double side)
    {
        super(side, side);
    }

    String getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Rentacle
{
    private double _radius;

    public Rentacle(double radius)
    {
        _radius = radius;
    }

    public double getArea() { return _radius * _radius * java.lang.Math.PI; }
}


public class Shapes {
    public static void main(String[] args) {
        System.out.println("Testing");

        Circle r = new Circle(3, 4);
        Square s = new Square(5);
        Rentacle c = new Rentacle(10);

        System.out.println("R: " + r.getArea() + ", S: " + s.getArea() + ", C: " + c.getArea());
    }
