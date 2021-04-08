package experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定义测试类
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        //测试Student类
        System.out.println("--------  测试Student类  ------------------");
        //需要抛出异常
        Date birthday1=new SimpleDateFormat("yyyy年MM月dd日").parse("2001年9月8日");
        S swk=new S("430001","孙悟空",'男',birthday1,"20180001","国学1班",89);
        System.out.println(swk);//输出swk所有信息
        swk.takeLesson("体育");
        swk.working("体育");
        //测试Teacher类
        System.out.println("--------  测试Teacher类  ------------------");
        //需要抛出异常
        Date birthday2=new SimpleDateFormat("yyyy年MM月dd日").parse("1981年10月1日");
        T ptzs=new T("430901","菩提祖师",'男',birthday2,"2011001","国学系",7800);
        System.out.println(ptzs);//输出ptzs
        ptzs.working("体育");
        ptzs.teaching(swk, "体育");
    }
}
