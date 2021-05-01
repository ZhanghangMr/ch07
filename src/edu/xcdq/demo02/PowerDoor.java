package edu.xcdq.demo02;

public class PowerDoor  extends  Door{
    @Override
    public void open(){
        System.out.println("电动门打开方式");
    }

    @Override
    public void close (){
        System.out.println("电动门关闭方式");
    }
}
