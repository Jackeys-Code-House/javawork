package experiment;

/**
 * 定义测试类
 */
public class CarYTest {
    public static void main(String []args) {
        CarY car1=CarFactory.getCar("红旗");
        System.out.println(car1.getInfo());
        CarY car2=CarFactory.getCar("吉利");
        System.out.println(car2.getInfo());
    }
}
