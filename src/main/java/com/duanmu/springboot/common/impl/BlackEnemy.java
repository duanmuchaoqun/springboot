package com.duanmu.springboot.common.impl;

import com.duanmu.springboot.common.Strategy;

public class BlackEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
