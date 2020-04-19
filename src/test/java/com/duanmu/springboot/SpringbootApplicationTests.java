package com.duanmu.springboot;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.context.MyContext;
import com.duanmu.springboot.common.impl.BackDoor;
import com.duanmu.springboot.common.impl.BlackEnemy;
import com.duanmu.springboot.common.impl.GivenGreenLight;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

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

    @Test
    public void testHashCode(){
        User user1 = new User();
        User user2 = new User();
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(Objects.equals(user1,user2));
        int hashCode = Objects.hash(1, "端木", "test@qq.com", "15258794569");
        int hashCode2 = Objects.hash(1, "端木", "test@qq.com", "15258794569");
        System.out.println(hashCode);
        System.out.println(hashCode2);
        User user3 = new User(1, "111", "test@qq.com", "15258794569");
        int hashCode1 = user3.hashCode();
        System.out.println(hashCode1);
        int hashCode3 = Objects.hashCode(user3);
        System.out.println(hashCode3);
        String userStr = Objects.toString(null);
        String user1Str = Objects.toString(user3);
        System.out.println(userStr);
        System.out.println(user1Str);
    }
}
