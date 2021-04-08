package experiment;
/**
 * 测试一要求如下：
 *(1)利用空构造方法创建一个新的长方体对象c，然后利用setter方法设置长宽高分别为1.5、2.6和18.6
 *(2)调用printCuboid()方法输出cuboidA的基本信息，调用isCube()方法判断是否正方体;
 *（3）调用方法drawing()模拟绘制该长方体。
 * @author 蒋缇
 */
public class CuboidTest {
    public static void main(String[] args) {
        Cuboid c=new Cuboid();
        c.setLength(1.5f);
        c.setWidth(2.6f);
        c.setHeight(18.6f);
        c.printCuboid();
        c.isCube();
        c.drawing();
    }
}
