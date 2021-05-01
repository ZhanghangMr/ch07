package edu.xcdq.demo03;




// 多继承（ 多重继承 )  多实现 （多重实现)
public class UncleTwo implements  Uncle , Father,GrandFather {
    @Override
    public  void faHongbao(){
        System.out.println("二舅发红包，送酒");
        System.out.println(chenhu);


    }

    @Override
    public  void yangjia(){

        System.out.println("二舅也是一位父亲，需要养家");
    }
}
