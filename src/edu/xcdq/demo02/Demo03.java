package edu.xcdq.demo02;

public class Demo03 {
    public static void main(String[] args) {
       Door door = new Door() {  // 匿名类
           @Override
           public void open() {
               System.out.println("在匿名类中打开");
           }

           @Override
           public void close() {
               System.out.println("在匿名类中关闭");
           }
       };
        door.open();
        door.close();
    }
}
