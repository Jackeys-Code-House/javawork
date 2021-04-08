package experiment;
/**
 * 定义中配汽车
 */
public class MidCar extends CarT implements Bluetooth{
    //1. 定义成员变量
    private boolean bluetoothState=false;//蓝牙状态
    //2. 定义构造方法
    public MidCar() {	}
    public MidCar(String brand, double speed) {
        super(brand, speed);
    }
    //3. 定义setter和getter方法
    public boolean getBluetoothState() {
        return this.bluetoothState;
    }
    //4. 定义功能方法
    @Override
    public void startBluetooth() {//启动蓝牙
        if(this.bluetoothState==false) {
            this.bluetoothState=true;
        }
    }
    @Override
    public void  closeBluetooth() {//关闭蓝牙
        if(this.bluetoothState==true) {
            this.bluetoothState=false;
        }
    }
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        sb.append("，蓝牙状态：").append(this.bluetoothState);
        return sb.toString();
    }
}
