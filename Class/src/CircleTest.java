public class CircleTest {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setX(3);
        c.setY(4);
        c.setRadius(5);
        System.out.println("Radius of circle is " + c.getRadius());
        System.out.println(c.area(5));
        System.out.println(c.circumference(5));
    }
}
