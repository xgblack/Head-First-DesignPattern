package Introduction_case.v1;

/**
 * @author 小光
 * @date 2019/9/3 10:27
 * className: MallardDuck
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a real Mallard duck!");
    }
}
