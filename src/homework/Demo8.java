package homework;
//对象初始化案例
class Student{
    //1.普通构造块
    {
        System.out.println("普通构造块1，输出数据成员name（定义之前）："+this.name);
    }
    //2.定义数据成员name
    String name="xxx";
    //3.定义构造块2
    {
        System.out.println("普通构造块1，输出数据成员name（定义之后）："+this.name);
    }
    //4.静态构造块1
    static{
        System.out.println("静态构造块1，输出数据成员count=（定义之前）："+Student.count);
        Student.count++;
    }
    //5.定义静态数据成员count
    static int count;
    //6.定义静态构造块2
    static{
        System.out.println("静态构造块2，输出数据成员count=（定义之后）："+Student.count);
        Student.count++;
    }
    //7.构造方法
    public Student(String name){
        System.out.println("构造方法，给成员变量赋值之前："+this.name);
        this.name=name;
        System.out.println("构造方法，给成员变量赋值之后："+this.name);
    }
}
public class Demo8 {
    public static void main(String[] args) {
        //测试Student类的执行过程
        Student std1=new Student("王阳明");
        Student std2=new Student("朱熹");
    }
}
