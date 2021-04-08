package experiment;

/**
 * 定义抽象类CarY
 */
public abstract class CarY {
    //1. 定义成员变量
    private String brand;
    private double price;
    //2. 定义构造方法
    public CarY(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    //3. 省略setter和getter方法
    //4. 定义功能方法
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("型号："+this.brand).append("，价格："+this.price);
        return sb.toString();
    }
    public abstract String getInfo() ;//抽象方法
}