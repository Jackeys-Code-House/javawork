package experiment;
/**
 * 测试二要求如下：
 *(1)利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体对象c，然后利用setLength()方法修改length为4.6；
 *(2)调用getArea()方法计算表面积；
 *(3)调用getCubage计算该长方体的体积
 * @author 蒋缇
 *
 */
public class CuboidTestAgain {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(2.5f,6.8f,8.0f);
        c.setLength(4.6f);
        System.out.println("该长方体的表面积"+c.getArea());
        System.out.println("该长方体的体积"+c.getCubage());
    }
}
