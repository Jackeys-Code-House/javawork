package experiment;

/**
 * 定义子类Rectangle实现接口Shape
 */
public class Rectangle implements Shape {
    //1. 定义成员变量
    private double length;
    private double width;
    //2. 定义构造方法
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    //3. 省略setter和getter方法
    //4. 定义功能方法
    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.length+this.width);
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("长："+this.length+"，宽："+this.width);
        return sb.toString();
    }
    @Override
    public void drawing() {
        System.out.println("正在绘制一个长方形"+this);
    }
}
