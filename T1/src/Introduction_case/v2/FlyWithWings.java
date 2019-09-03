package Introduction_case.v2;

/**
 * @author 小光
 * @date 2019/9/3 10:32
 * className: FlyWithWings
 * description: 会飞的
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying...");
    }
}
