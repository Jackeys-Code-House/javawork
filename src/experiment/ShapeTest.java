package experiment;

/**
 * 定义测试类
 */
public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("---------  测试圆Circle类 --------------");
        System.out.println("\t输出半径为10的圆面积：");
        System.out.println(MyShape.area(new Circle(10)));
        System.out.println("\t输出半径为10的圆周长：");
        System.out.println(MyShape.perimeter(new Circle(10)));
        System.out.println("\t画半径为10的圆：");
        MyShape.drawing(new Circle(10));
        System.out.println("---------  测试长方形类Rectangle --------------");
        System.out.println("\t输出指定长宽的矩形面积：");
        System.out.println(MyShape.area(new Rectangle(10,20)));
        System.out.println("\t输出指定长宽的矩形周长：：");
        System.out.println(MyShape.perimeter(new Rectangle(10,20)));
        System.out.println("\t画长方形");
        MyShape.drawing(new Rectangle(10,20));
    }
}
