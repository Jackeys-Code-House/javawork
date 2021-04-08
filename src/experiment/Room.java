package experiment;

/**
 * 定义房间类Room，要求如下：
 * (1)私有成员变量包括房间编号id，面积area，户型type，单价price（元/平米），销售状态state等；
 * (2)定义一个空构造方法；定义第二个构造方法能够根据房间编号，面积，单价创建Room对象；定义第三个构造方法能够根据所有成员变量创建Room对象；
 * (3)定义针对成员变量state和price的setter和getter方法，定义getArea()方法返回房间面积；
 * (4)功能方法包括：showRoom()方法输出Room对象所有成员变量；getMoney()获得房间总价。
 * @author 蒋缇
 */
//=====定义Room类
class Room {
    //====定义成员变量
    private String id;//房间编号
    private float area;//面积
    private String type;//户型
    private int price;//单价
    private boolean state;//销售状态
    /**
     * 定义一个空构造方法
     */
    public Room() {
    }
    /**
     * 定义第二个构造方法能够根据房间编号，面积，单价创建Room对象
     * @param id 房间编号
     * @param area 面积
     * @param price 单价
     */
    public Room(String id, float area, int price) {
        this.id = id;
        this.area = area;
        this.price = price;
    }
    /**
     * 定义第三个构造方法能够根据所有成员变量创建Room对象
     * @param id 房间编号
     * @param area 面积
     * @param type 户型
     * @param price 单价
     * @param b 销售状态
     */
    public Room(String id, float area, String type, int price, boolean state) {
        this.id = id;
        this.area = area;
        this.type = type;
        this.price = price;
        this.state = state;
    }
    /**
     * 定义针对成员变量state和price的setter和getter方法
     */
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setArea(float area) {
        this.area = area;
    }
    /**
     * 定义getArea()方法返回房间面积
     * @return 房间面积
     */
    public float getArea() {
        return area;
    }
    /**
     * 输出Room对象所有成员变量
     */
    public void showRoom(){
        System.out.println(id+"   "+area+"   "+type+"   "+price+"   "+state);
    }
    /**
     * getMoney()获得房间总价
     * @return 总价
     */
    public float getMoney() {
        return area*price;
    }
}
