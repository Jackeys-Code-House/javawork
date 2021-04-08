package experiment;

/**
 * 定义吉利汽车类GeelyCar
 */
public class GeelyCar extends CarY{
    //1. 定义成员变量
    //2. 定义构造方法
    public GeelyCar(String brand, double price) {
        super(brand, price);
    }
    //3.省略setter和getter方法
    //4.定义功能方法
    @Override
    public String getInfo() {
        return this.toString();
    }
}