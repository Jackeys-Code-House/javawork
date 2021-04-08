package experiment;

import java.util.Scanner;
//java第三次实验(2)
public class StudentManagementSystem {
    public static void main(String[] args) {
        System.out.println("**********学生管理系统**********");
        while(true){
            System.out.println("----1. 查询--------2. 增加----\n----3. 修改--------4. 删除----\n----0. 退出----");
            System.out.println("**********学生管理系统**********");
            System.out.println("请输入菜单号：");
            Scanner key=new Scanner(System.in);
            String instructions=key.next();
            if("1".equals(instructions)){
                System.out.println("查询学生信息");
            }else if("2".equals(instructions)){
                System.out.println("删除学生信息");
            } else if("3".equals(instructions)){
                System.out.println("修改学生信息");
            }else if("4".equals(instructions)){
                System.out.println("删除学生信息");
            }else if("0".equals(instructions)){
                System.out.println("退出学生管理系统");
                break;
            }else{
                System.out.println("请按照要求输入菜单号");
            }
        }
    }
}
