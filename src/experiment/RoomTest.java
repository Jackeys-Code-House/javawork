package experiment;

public class RoomTest {
    /**
     * 定义测试类，对表6-1完成如下操作：
     * (1)统计3个房间的总面积；
     * (2)统计3个房间的总价；
     * (3)把3-2-502房间的销售状态修改为true；
     * (4)显示3个房间的详细信息。
     * @author 蒋缇
     *
     */
    public static void main(String []agrs) {
            //====初始化三个房间
            Room room1=new Room("3-2-502",113.5f,"三室一厅",15000,false);
            Room room2=new Room("4-5-1108",156.9f,"四室二厅",17500,true);
            Room room3=new Room("4-3-1501",45.9f,"二室一厅",16200,true);
            //====统计3个房间的总面积
            System.out.println("3-2-502的面积："+room1.getArea()+"，  4-5-1108的面积："+
                    room2.getArea()+"，  4-3-1501的面积："+room3.getArea());
            System.out.println("三个房间的总面积："+(room1.getArea()+room2.getArea()+room3.getArea()));
            //====统计3个房间的总价
            System.out.println("3-2-502的总价："+room1.getMoney()+"，  4-5-1108的总价："+
                    room2.getMoney()+"，  4-3-1501的总价："+room3.getMoney());
            System.out.println("三个房间的总价："+(room1.getMoney()+room2.getMoney()+room3.getMoney()));
            //====把3-2-502房间的销售状态修改为true
            room1.setState(true);
            System.out.println("3-2-502的销售状态："+room1.getState());
            //====显示3个房间的详细信息
            System.out.println("编号"+"       "+"面积"+"    "+"户型"+"      "+"单价"+"    "+"总价"+"       "
                    +"销售状态");
            System.out.println(room1.getId()+"    "+room1.getArea()+"   "+room1.getType()+"  "+room1.getPrice()
                    +"   "+room1.getMoney()+"  "+room1.getState());
            System.out.println(room2.getId()+"   "+room2.getArea()+"   "+room2.getType()+"  "+room2.getPrice()
                    +"   "+room2.getMoney()+"  "+room2.getState());
            System.out.println(room3.getId()+"   "+room3.getArea()+"    "+room3.getType()+"  "+room3.getPrice()
                    +"   "+room3.getMoney()+"   "+room3.getState());
        }
}
