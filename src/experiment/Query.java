package experiment;


//java第三次实验(1)
import java.util.Scanner;

public class Query {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        while(true){
            System.out.println("请输入奖票号码：(结束请输出over)");
            String number = key.next();
            if("over".equals(number)){
                System.out.println("感谢查询，祝您好运！");
                break;
            }else{
                if("f".equals(number)||"F".equals(number)){
                    System.out.println("一等奖：奥迪Q5");
                }else if("s".equals(number)||"S".equals(number)){
                    System.out.println("二等奖：吉利博越");
                }else if("t".equals(number)||"T".equals(number)){
                    System.out.println("三等奖：奇瑞QQ");
                }else{
                    System.out.println("很抱歉，您没有中奖，结束请输入over");
                }
            }
        }

    }
}
