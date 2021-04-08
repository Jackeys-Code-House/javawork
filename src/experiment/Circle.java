package experiment;

/**
 * 定义子类Circle实现接口
 */
public class Circle implements Shape {
    //1. 定义成员变量
    private double radius;
    //2. 定义构造方法
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    //3. 省略setter和getter方法
    //4. 定义功能方法
    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public void drawing() {
        System.out.println("正在绘制一个圆,"+this);

    }
    @Override
    public String toString() {
        return "圆的半径为"+this.radius;
    }
}