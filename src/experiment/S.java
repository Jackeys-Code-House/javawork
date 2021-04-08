package experiment;

import java.util.Date;

/**
 * 定义S类继承P
 */
public class S extends P{
    //1. 定义成员变量
    private String studentID;
    private String className;
    private double score;
    public static String schoolName="吉首大学";
    //2. 定义构造方法
    public  S() {}
    public S(String id, String name, char sex, Date birthday,
                   String studentID, String className, double score) {
        super(id, name, sex, birthday);
        this.studentID = studentID;
        this.className = className;
        this.score = score;
    }
    //3. 省略setter和getter方法
    //4. 定义功能方法
    public String toString() {//重写toString()方法
        return super.toString()+"，学号："+this.studentID+"，班级："+this.className+",成绩："+this.score;
    }
    //学生选课方法
    public void takeLesson(String course) {
        System.out.println(this.getName()+"选修了 "+course+" 课程");
    }
    @Override
    public void working(String information) {
        System.out.println(this.getName()+"正在学习："+information);
    }
}
