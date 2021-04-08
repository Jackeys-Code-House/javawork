package experiment;
/**
 * 定义长方体类Cuboid，要求如下：
 （1）私有成员变量包括长length、宽width和高height；
 （2）构造方法包括一个公共的空构造方法，一个能够初始化所有成员变量的构造方法；
 （3）包括所有的setter和getter方法，其中setter方法要求对形参进行验证，例如长、宽和高都大于0；
 （4）功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid()、绘制该长方体（给出提示信息即可）drawing()。
 * @author 蒋缇
 */
public class Cuboid {
    //===定义成员变量
    private float length;//长度
    private float width;//宽度
    private float height;//高
    /**
     * 构造空构造方法
     */
    public Cuboid() {
    }
    /**
     * 构造初始化方法
     * @param length 长
     * @param width 宽
     * @param height 高
     */
    public Cuboid(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    /**
     * 构造setter和getter方法
     */
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if(length>0) {
            this.length = length;
        }
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if(width>0) {
            this.width = width;
        }
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        if(height>0) {
            this.height = height;
        }
    }
    //===构造功能方法
    /**
     * 计算表面积
     * @return
     */
    public float getArea() {
        return 2*(length*width+width*height+length*height);
    }
    /**
     * 计算体积
     * @return
     */
    public float getCubage() {
        return length*width*height;
    }
    /**
     * 判断是否正方体
     */
    public void isCube() {
        if(this.height==this.length&&this.height==this.width) {
            System.out.println("该长方体是正方体！");
        }else {
            System.out.println("该长方体不是正方体！");
        }
    }
    /**
     * 输出该长方体的长宽高
     */
    public void printCuboid() {
        System.out.println("该长方体的长为："+this.length);
        System.out.println("该长方体的宽为："+this.width);
        System.out.println("该长方体的高为："+this.height);
    }
    /**
     * 绘制该长方体
     */
    public void drawing() {
        System.out.println("***绘制长方体***");
    }
}
