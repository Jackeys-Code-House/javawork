package experiment;
/**
 * 定义MyShape类
 */
public class MyShape {
    public static double area(Shape shape) {
        return shape.getArea();
    }
    public static double perimeter(Shape shape) {
        return shape.getPerimeter();
    }
    public static void drawing(Shape shape) {
        shape.drawing();
    }
}
