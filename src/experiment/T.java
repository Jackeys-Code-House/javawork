package experiment;

import java.util.Date;
/**
 * 定义T类继承抽象类P
 */
public class T extends P{
    // 1. 定义成员变量
    private String teacherID;
    private String department;
    private double salary;
    public static String schoolName="吉首大学";
    //2. 定义构造方法
    public T() {}
    public T(String id, String name, char sex, Date birthday,
                   String teacherID, String department, double salary) {
        super(id, name, sex, birthday);
        this.teacherID = teacherID;
        this.department = department;
        this.salary = salary;
    }
    //3. 省略setter和getter方法
    //4. 功能方法
    public String toString() {
        return super.toString()+",教工号："+this.teacherID+",部门:"
                +this.department+"，工资："+this.salary;
    }
    public void teaching(S std,String course) {//为学生授课
        System.out.println(this.getName()+"正在为"+std.getName()+"讲授"+course);
        std.working(course);//学生正在学习
    }
    @Override
    public void working(String information) {
        System.out.println(this.getName()+"正在准备"+information);
    }
}
