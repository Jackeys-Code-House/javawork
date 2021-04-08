package experiment;
/**
 * 定义汽车类Car,要求如下：
 * (1)私有成员变量包括汽车品牌brand，排气量emission和价格price；
 * (2)定义一个构造方法初始化所有成员变量；
 * (3)定义getBrand()方法返回品牌信息;
 * (4)功能方法包括：starting()方法启动发动机。
 *
 *定义Hand类，要求如下：
 *(1)私有成员变量包括手指长度length，手掌面积area和握力grip；
 *(2)定义构造方法初始化所有成员变量;
 *(3)省略setter和getter方法；
 *(4)功能方法包括：catching(String thing)方法抓东西，getInfo()方法取得Hand的所有信息。
 *
 *定义Person类，要求如下：
 *(1)私有成员变量包括身份证号码id,姓名name，年龄age和手hand;
 *(2)定义一个空构造方法，另一个构造方法初始化所有成员变量；
 *(3)定义getName()方法返回人的姓名;
 *(4)功能方法包括：showPerson()方法显示某人的所有信息；
 *(2)saying(Person per,String msg)方法表示一个人对另一个人说了一些信息msg;
 *(3)getSomething(String something)表示用手拿东西，需要调用Hand对象的拿方法catching();
 *(4)start(Car car)方法表示某人启动了一台汽车，需要调用Car的starting方法启动发动机。
 *
 *定义测试类Demo，完成如下任务：
 *(1)创建一台汽车，品牌是红旗L5，排气量是3.0，价格是25万；
 *(2)创建一只手，手指长度8厘米,手掌面积42平方厘米，握力是45kg；
 *(3)创建Person对象孙悟空和猪八戒，孙悟空向猪八戒说“八戒，你这个呆子！”，孙悟空拿了一根金箍棒并启动了一辆红旗L5汽车。
 * @author 蒋缇
 *
 */
//=====定义Car类
class Car{
    /**
     * 定义成员变量
     */
    private String brand;//汽车品牌
    private float  emission;//排气量
    private int price;//价格
    /**
     * 初始化所有成员变量
     * @param brand 汽车品牌
     * @param emission 排气量
     * @param price 价格
     */
    public Car(String brand, float emission, int price) {
        this.brand = brand;
        this.emission = emission;
        this.price = price;
    }
    /**
     * 定义getBrand()方法返回品牌信息
     * @return 品牌信息
     */
    public String getBrand() {
        return brand;
    }
    /**
     * 启动发动机
     */
    public String starting() {
        return "启动一辆"+this.brand+"汽车";
    }
}
//=====定义Hand类
class Hand{
    //定义成员变量
    private float length;//手指长度
    private float area;//手掌面积
    private float grip;//握力
    /**
     * 定义构造方法初始化所有成员变量
     */
    public Hand(float length, float area, float grip) {
        this.length = length;
        this.area = area;
        this.grip = grip;
    }
    /**
     * 定义catching(String thing)方法抓东西
     */
    public static String catching(String thing) {
        return "拿了"+thing;
    }
    /**
     * getInfo()方法取得Hand的所有信息
     */
    public void getInfo() {
        System.out.println("手指长度"+this.length+"厘米"+", 手掌面积"+this.area+
                "平方厘米"+this.grip+"，握力是"+this.grip+"kg");
    }
}
//=====定义Person类
class Person{
    //定义成员变量
    private String id;//身份证号码
    private String name;//姓名
    private int age;//年龄
    private String hand;//手
    /**
     * 定义一个空构造方法
     */
    public Person() {
    }
    /**
     * 构造方法初始化所有成员变量
     */
    public Person(String id, String name, int age, String hand) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hand = hand;
    }
    /**
     * 定义getName()方法返回人的姓名
     * @return 人的姓名
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /**
     * showPerson()方法显示某人的所有信息
     */
    public void showPerson() {
        System.out.println("身份证号码："+this.id+",姓名："+this.name+"，年龄："+this.age+"，手："+this.hand);
    }
    /**
     * saying(Person per,String msg)方法表示一个人对另一个人说了一些信息msg
     */
    public void saying(Person per,String msg) {
        System.out.println(this.name+"对"+per.name+"说："+msg);
    }
    /**
     * getSomething(String something)表示用手拿东西
     * 需要调用Hand对象的拿方法catching()
     */
    public void getSomething(String something) {
        System.out.println(this.name+Hand.catching(something));
    }
    /**
     * start(Car car)方法表示某人启动了一台汽车
     * 需要调用Car的starting方法启动发动机
     * @param car Car类
     */
    public void start(Car car) {
        System.out.println(this.name+car.starting());
    }
}
//=====测试类
public class Demo {
    public static void main(String[] args) {
        /**
         * (1)创建一台汽车，品牌是红旗L5，排气量是3.0，价格是25万；
         */
        Car car=new Car("红旗L5",3.0f,250000);
        //System.out.println(car.starting());
        /**
         * (2)创建一只手，手指长度8厘米,手掌面积42平方厘米，握力是45kg
         */
        Hand hand=new Hand(8f,42f,45f);
        //hand.getInfo();
        /**
         * 创建Person对象孙悟空和猪八戒，孙悟空向猪八戒说“八戒，你这个呆子！”
         * 孙悟空拿了一根金箍棒并启动了一辆红旗L5汽车
         */
        Person 孙悟空=new Person();
        Person 猪八戒=new Person();
        孙悟空.setName("孙悟空");
        猪八戒.setName("猪八戒");
        孙悟空.saying(猪八戒, "“八戒，你这个呆子！”");
        孙悟空.getSomething("一根金箍棒");
        孙悟空.start(car);
    }
}