package homework;
/*
* 单例模式设计要点：
* （1）某个类只有一个实例；
* （2）它必须自行创建这个实例；
* （3）它必须自行向整个系统提供这个实例。
*
* 案 例：捕鱼达人游戏中只有一个炮台，该炮台能够发射不同的炮弹，把炮台设计成单例类*/
//设计炮台类
class Battery{
    //第一步，私有化静态成员变量
    private static Battery bat;
    //第二步，构造方法私有化
    private Battery(){}
    //第三步，公有静态变量成员方法返回类的唯一实例
    public static Battery getInstance(){
        if(bat==null){
            bat=new Battery();
        }
        return bat;
    }
    //定义成员方法发射炮弹
    public void fire(String bomb){
        System.out.println("发射："+bomb);
    }
}
public class Demo9 {
    public static void main(String[] args) {
        //进行测试
        Battery bat=Battery.getInstance();//取得炮台实例
        bat.fire("导弹");
        bat.fire("手榴弹");
    }
}
