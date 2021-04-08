package experiment;

import java.util.Scanner;

/**
 *定义工厂类
 */
public class CarFactory {
    public static CarY getCar(String name) {
        Scanner scan=new Scanner(System.in);
        if(name.equalsIgnoreCase("红旗")) {
            System.out.println("请输入红旗汽车的型号");
            String brand=scan.nextLine();
            System.out.println("请输入红旗汽车的价格");
            double price=scan.nextDouble();
            CarY red=new RedCar(brand,price);
            return red;
        }else if(name.equalsIgnoreCase("吉利")) {
            System.out.println("请输入吉利汽车的型号");
            String brand=scan.nextLine();
            System.out.println("请输入吉利汽车的价格");
            double price=scan.nextDouble();
            CarY geely=new GeelyCar(brand,price);
            return geely;
        }else {
            return null;
        }
    }
}
