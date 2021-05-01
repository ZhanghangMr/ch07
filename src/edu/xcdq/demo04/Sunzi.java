package edu.xcdq.demo04;

//孙子类 标准实体类 ， 需要实现全部父类中累计没有实现的所有抽象方法
public class Sunzi  extends Baba {
    @Override
    public void tangtou() {
        System.out.println("替爸爸完成烫头");
    }

    @Override
    public void diaoyu() {
        System.out.println("替爷爷完成钓鱼");

    }
}
