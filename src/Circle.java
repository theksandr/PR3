public class Circle
{
    private int radius;
    private double diameter, area, length;

    public Circle(int r)
    {
        radius=r;
        diameter = radius*2;
        area = Math.pow(Math.PI*radius, 2);
        length = 2*Math.PI*radius;
    }

    public Circle()
    {
        radius = 5;
        diameter = radius*2;
        area = Math.pow(Math.PI*radius, 2);
        length = 2*Math.PI*radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
        this.diameter = radius*2;
        this.area = Math.pow(Math.PI*radius, 2);
        this.length = 2*Math.PI*radius;
    }

    public String toString(){
        return "radius " + this.radius+", diameter "+this.diameter+", area "+this.area+", length "+this.length;
    }

    public int getRadius()
    {
        return radius;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public double getArea()
    {
        return area;
    }

    public double getLength()
    {
        return length;
    }
}
