package edu.xcdq.demo03;

public interface Uncle {

    // 公有的常量
    public String  chenhu = "舅舅";

    // 在接口中声明方法
    public void faHongbao() ;

    // 不管那个舅舅都需要照顾老人 为了避免重复，写在接口中，default
    public default void zhaogulaoren(){
        System.out.println("每个舅舅都需要照顾老人");
    }

    // static 修饰的方法，每个子类都有.只能通过 接口 ，方法() 调用
    public  static void zhaoguxiaohai(){
        System.out.println("每个舅舅都需要照顾小孩");
    }

}
