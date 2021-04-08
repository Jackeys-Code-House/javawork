package experiment;

import java.lang.reflect.Array;

//java第三次实验(3)
public class Test {
    public static void main(String[] args) {
        while(true){
            int number=getRandomNumber();
            if(number>=50&&number<=60){
                continue;
            }else{
                if(number%7==0){
                    break;
                }else if(number%2!=0){
                    getSum(number);
                }else if(number%2==0){
                    getFactor(number);
                }
            }
        }
    }
    //随机生成不大于100的数
    public static int getRandomNumber(){
        int aInt=(int)(Math.random()*100);
        return aInt;
    }
    //计算1/1+1/2+......1/aInt
    public static void getSum(int aInt){
        System.out.println("奇数"+aInt+"合为：");
        float sum=0.0f;
        for(int i=1;i<=aInt;i++){
            sum+=1.0f/(float)i;
        }
        System.out.println(sum);
    }
    //计算偶数的所有因子
    public static void getFactor(int aInt){
        System.out.println("偶数"+aInt+"的因子有：");
        for(int i=1;i<=aInt;i++){
            if(aInt%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
