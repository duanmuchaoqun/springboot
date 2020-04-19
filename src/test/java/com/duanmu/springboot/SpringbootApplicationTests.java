package com.duanmu.springboot;

import com.duanmu.springboot.common.context.MyContext;
import com.duanmu.springboot.common.impl.BackDoor;
import com.duanmu.springboot.common.impl.BlackEnemy;
import com.duanmu.springboot.common.impl.GivenGreenLight;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testStrategy(){
        MyContext context;
        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context = new MyContext(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }
}
