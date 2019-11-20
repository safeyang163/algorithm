
package com.homestayManage;


import com.homestay.utils.DateUtil;
import com.homestay.utils.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.Semaphore;

public class HomestayApplicationTests {
//    static int index = 0;



    @Test
    public void contextLoads() {
        moveZeroes(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
    public void moveZeroes(int[] nums) {
//        int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int j = 0 ;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]) {
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println(j+1);
    }

  //开发多年，算法新手上路，题目上来一看直接for循环实现然后参考解析后感觉自己实现low爆了，努力学习算法

}

