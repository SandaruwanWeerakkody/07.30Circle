public class testCircle {
    public static void main(String[] args) {

        Circle obj3 = new Circle(6.3,"Black");
        System.out.println("Circle 3 radius is "+obj3.getRadius());
        System.out.println("Circle 3 radius is "+obj3.getColour());
        System.out.println("Circle 3 radius is "+obj3.getArea());

        Circle obj2 = new Circle(6.2);
        System.out.println("Circle 2 radius is "+obj2.getRadius());
        System.out.println("Circle 2 radius is "+obj2.getColour());
        System.out.println("Circle 2 radius is "+obj2.getArea());

        Circle obj1 = new Circle();
        System.out.println("Circle 1 radius is "+obj1.getRadius());
        System.out.println("Circle 1 radius is "+obj1.getColour());
        System.out.println("Circle 1 radius is "+obj1.getArea());

    }
}
