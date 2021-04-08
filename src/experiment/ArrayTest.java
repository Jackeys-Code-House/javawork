package experiment;
/*java第五次实验(1)*/
/**
 * 1. 定义方法copyArray(int[]src,int begin,int end,int []dest),能够把数组src中从begin开始到end结束的元素复制到数组dest中。
 */
public class ArrayTest {
    public static void main(String[] args) {
        int src []=new int[]{1,2,3,4,5,6,7};
        int dest []=new int[4];
        copyArray(src,2,5,dest);
        for(int i=0;i<dest.length;i++){
            System.out.print(dest[i]+"");
        }
    }

    /**
     *
     * @param src 以该数组为模板进行复制
     * @param begin 开始下标
     * @param end 结束小下标
     * @param dest 复制数组
     */
    public static void copyArray(int [] src,int begin,int end,int [] dest){
        try {
            int cnt = 0;
            for (int i = begin; i <= end; i++) {
                dest[cnt++] = src[i];
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组越界");
            e.printStackTrace();
        }
    }
}
