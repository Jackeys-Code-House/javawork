package experiment;

import java.util.Arrays;
import java.util.Vector;

import static java.lang.Character.MIN_VALUE;

/**
 * 2. 定义重载方法getMax()，该方法可以返回元素是整数的一维数组、二维数组的最大元素，也可以返回元素是浮点数的Vector中的最大元素，该方法还可以返回三个浮点数中的最大值
 */
public class MaxTest {
    public static void main(String[] args) {
        int [] arr1=new int[]{1,2,3,4,5,6};
        System.out.println("一维数组最大值为："+getMax(arr1));
        int [][] arr2={{1,2,3,4},{3,4,5,6,7},{1,2,4,6}};
        System.out.println("二维数组的最大值为："+getMax(arr2));
        Vector<Float> vt=new Vector<>();
        vt.add(1.2f);
        vt.add(1.4f);
        vt.add(1.7f);
        System.out.println("一维vector数组的最大值为："+getMax(vt));

    }
    /**
     *
     * @param arr int型一位数组
     * @return 返回int型的最大值
     */
    public static int getMax(int arr[]){
        int max=arr[0];/*默认第一个为最大*/
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){/*替换最大值*/
                max=arr[i];
            }
        }
        return max;/*返回*/
    }

    /**
     *
     * @param arr int型二维数组
     * @return 返回int型的最大值
     */
    public static int getMax(int arr[][]){
        int max=MIN_VALUE;/*int的最小值*/
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){/*替换最大值*/
                    max=arr[i][j];
                }
            }
        }
        return max;/*返回*/
    }

    /**
     *
     * @param vt Float泛型的一维vector数组
     * @return
     */
    public static float getMax(Vector<Float> vt){
        float max=vt.get(0);/*默认第一个为最大*/
        for(int i=1;i<vt.size();i++){
            if(vt.get(i)>max){/*替换最大值*/
                max=vt.get(i);
            }
        }
        return max;/*返回*/
    }
}
