public class TestCircle
{
    public static void main(String[] args)
    {
            Circle circ1 = new Circle(4);
            Circle circ2 = new Circle();
            System.out.print(circ1.toString()+"\n");
            circ1.setRadius(3);
            System.out.print(circ1.getRadius()+"\n");
            System.out.print(circ1.getDiameter()+"\n");
            System.out.print(circ1.getArea()+"\n");
            System.out.print(circ1.getLength()+"\n");
    }
}
