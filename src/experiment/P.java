package experiment;

import java.util.Date;

/**
 * (1) 定义父类Person是抽象类，其中working()方法是抽象方法；
 * (2) 分别定义子类Student和Teacher继承Person类;
 * (3) 在子类中，重写父类抽象方法working()，重写Object类中的toString()方法返回有意义的子类对象信息。
 */
public abstract class P {
    //1. 定义成员变量
    private String id;
    private String name;
    private char sex;
    private Date birthday;
    public static String nationality="中国";
    //2. 定义构造方法
    public P() {	}
    public P(String id, String name, char sex, Date birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
    //3. 必要的getter方法，省略其它setter和getter方法
    public String getName() {
        return this.name;
    }
    //4. 定义功能方法
    public void saying(P per,String msg) {//对某人说
        System.out.println(this.name+"对"+per.name+"说："+msg);
    }
    public String toString() {//重写Object中的toString()方法
        return "姓名:"+this.name+"，性别："+this.sex+"，出生日期："+this.birthday;
    }
    //定义抽象方法
    public abstract void working(String information);
}
