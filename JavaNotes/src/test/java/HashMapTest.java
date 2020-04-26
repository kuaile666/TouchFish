import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/26
 */
public class HashMapTest {
    @Test
    public void test() {
        System.out.println("hello".hashCode());

    }

    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>(10);
        map.put("刘德华", 15);
        map.put("周星驰", 15);
        map.put("通话", 15);
        map.put("重地", 15);
        System.out.println(map);
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }

    @Test
    public void test3() {
        int n= 4;
        n=n<<2;
        System.out.println(n);

    }
    @Test
    public void test4() {
        int i;
        int num = 0xFFFFFFE;
        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println(num);
        }


    }
    @Test
    public void test5() {
        System.out.println(~7);
        System.out.println(53 % 16);
    }
    @Test
    public void test6() {
        int MAXIMUM_CAPACITY=2^30;
        int cap=63;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println((n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1);

    }
    @Test
    public void test7() {
        System.out.println("".hashCode());

    }
}
