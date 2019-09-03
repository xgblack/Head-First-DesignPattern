package Introduction_case.v2;

/**
 * @author 小光
 * @date 2019/9/3 10:49
 * className: FlyRocketPowered
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket!!");
    }
}
