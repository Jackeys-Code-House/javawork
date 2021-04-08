package experiment;

import java.awt.*;
import java.util.Random;

public class HignCar extends CarT implements GPS,IOV{
    //1. 定义成员变量
    private Point location;//位置
    //2. 定义构造方法
    public HignCar() {
        super();
        // TODO Auto-generated constructor stub
    }
    public HignCar(String brand, double speed) {
        super(brand, speed);
        // TODO Auto-generated constructor stub
    }
    //3. 定义setter和getter方法
    //4. 定义功能方法
    @Override
    public void getConnetion(CarT car) {
        if(car instanceof IOV) {//如果该汽车是IOV的子类实例，表明具有IOV功能
            System.out.println(this.getBrand()+"建立与"+car.getBrand()+"的连接！");
        }
        else {
            System.out.println(car.getBrand()+"没有物联网接口！");
            System.out.println(this.getBrand()+"不能建立与"+car.getBrand()+"的连接！");
        }
    }
    @Override
    public Point getLocation() {
        Point p=new Point();
        double x=new Random().nextInt(50);
        double y=new Random().nextInt(50);
        p.setLocation(this.getSpeed()+x, this.getSpeed()+y);
        return p;
    }
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        sb.append(",位置：").append(this.getLocation().getX());
        sb.append(","+this.getLocation().getY());
        return sb.toString();
    }
}
