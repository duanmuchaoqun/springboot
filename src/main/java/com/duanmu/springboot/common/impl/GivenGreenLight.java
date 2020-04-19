package com.duanmu.springboot.common.impl;

import com.duanmu.springboot.common.Strategy;

public class GivenGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
