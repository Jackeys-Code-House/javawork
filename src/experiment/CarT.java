package experiment;

/**
 * 定义汽车类
 */
public class CarT {
    //1. 定义成员变量
    private String brand;
    private double speed;
    //2. 定义构造方法
    public CarT() {}
    public CarT(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    //3. 必要的setter和getter方法
    public double getSpeed() {
        return this.speed;
    }
    public String getBrand() {
        return this.brand;
    }
    //4. 功能方法
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("品牌：").append(this.brand);
        sb.append("，速度：").append(this.speed);
        return sb.toString();
    }
}
