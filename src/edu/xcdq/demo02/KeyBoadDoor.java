package edu.xcdq.demo02;

public class  KeyBoadDoor extends  Door {

    @Override
    public  void open(){
        System.out.println("键盘门打开方式");
    }

    @Override
    public void close (){
        System.out.println("键盘门关闭方式");
    }
}
