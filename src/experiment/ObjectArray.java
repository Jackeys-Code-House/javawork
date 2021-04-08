package experiment;

import java.util.Scanner;
//java第四次实验
class Phone{
    private String name;
    private int count;
    private int price;
    private int total;
    private int number;

    public Phone(String name,int count, int price, int total, int number) {
        this.count = count;
        this.price = price;
        this.name = name;
        this.total = total;
        this.number = number;
    }
    public Phone(){
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
public class ObjectArray {
    public static void main(String[] args) {
        Phone []phones=new Phone[]{new Phone("华为",10,3500,35000,1),new Phone("小米",20,2100,42000,2),
        new Phone("VIVO",17,2800,47600,3),new Phone("OPPO",8,1355,10840,4)};
        while(true){
            System.out.println("***********手机销售管理**********");
            System.out.println("---- 1.显示--------- 2.按单价排序 ----\n---- 3.查询--------- 0.退出");
            System.out.println("请输入功能代码（0-3）");
            Scanner key=new Scanner(System.in);
            int flag=key.nextInt();
            if(flag==0){
                System.out.println("退出成功");
                break;
            }else if(flag==1){
                output(phones);
            }else if(flag==2){
                sortOutput(phones);
            }else if(flag==3){
                System.out.println("请输入品牌名查询：");
                String str=key.next();
                inquire(phones,str);
            }else{
                System.out.println("***********手机销售管理**********");
                System.out.println("---- 1.显示--------- 2.按单价排序 ----\n---- 3.查询--------- 0.退出");
                System.out.println("请输入功能代码（0-3）");
            }
        }

    }
    public static void output(Phone [] phones){
        System.out.println("序号   手机品牌   数量   单价   小计");
        for(Phone phone:phones){
            System.out.println(phone.getNumber()+"     "+phone.getName()+"     "+phone.getCount()+"     "+phone.getPrice()+"     "+phone.getTotal());
        }
    }    public static void inquire(Phone [] phones,String str){
        for(Phone phone:phones){
            if(phone.getName().equals(str)){
               System.out.println("品牌："+phone.getName()+"    数量："+phone.getCount()+"    单价："+phone.getPrice());
                break;
            }
        }
    }
    public static void sortOutput(Phone [] phones){
        for(int i=0;i<phones.length-1;i++){
            for(int j=0;j< phones.length-1;j++){
                int price1=phones[j].getPrice();
                int price2=phones[j+1].getPrice();
                if(price1>price2){
                    Phone phone=phones[j];
                    phones[j]=phones[j+1];
                    phones[j+1]=phone;
                }
            }
        }
        System.out.println("序号   手机品牌   数量   单价   小计");
        for(int i=phones.length-1;i>=0;i--){
            System.out.println(phones[i].getNumber()+"     "+phones[i].getName()+"     "+phones[i].getCount()+"     "+phones[i].getPrice()+"     "+phones[i].getTotal());
        }
    }
}
