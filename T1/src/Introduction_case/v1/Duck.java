package Introduction_case.v1;

/**
 * @author 小光
 * @date 2019/9/3 10:27
 * className: Duck
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("i'm swimming");
    }
    public void display(){
        System.out.println("...");
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
