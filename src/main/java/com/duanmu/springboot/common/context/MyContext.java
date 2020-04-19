package com.duanmu.springboot.common.context;

import com.duanmu.springboot.common.Strategy;

public class MyContext {
    private Strategy strategy;

    public MyContext(Strategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
