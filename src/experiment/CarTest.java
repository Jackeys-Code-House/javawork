package experiment;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("------- 测试低配汽车  -------------");
        CarT gen=new CarT("红旗L5",60);
        System.out.println(gen);
        System.out.println("------- 测试中配汽车  -------------");
        MidCar mc=new MidCar("红旗L5",80);
        mc.closeBluetooth();
        System.out.println(mc);
        mc.startBluetooth();
        System.out.println(mc);
        System.out.println("------- 测试高配汽车  -------------");
        HignCar lc1=new HignCar("红旗H5",120);
        System.out.println(lc1);
        lc1.getConnetion(mc);//红旗H5与红旗L5不能建立连接
        HignCar lc2=new HignCar("宝马X5",100);
        lc1.getConnetion(lc2);//红旗H5与宝马X5能建立连接
    }
}
