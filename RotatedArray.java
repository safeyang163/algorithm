package com.homestayManage;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @Author: HP
 * @Description: 第二天  旋转数组
 * @Date: 2019/11/21 09:20
 * @Version: 1.0
 */
public class RotatedArray {


    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        copyAnotherArray(nums, 3);
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate1(nums, 3);
//        int k = 0 % 7;
//        System.out.println(k);
    }

    //O(kn) 时间复杂度 暴力解法
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int temp = 0;
        while (k > 0) {
            for (int i = nums.length - 1; i > 0; i--) {
                temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
            k--;
        }

        System.out.println(JSON.toJSON(nums));
    }

    //复制数组 暴力解法
    public void copyAnotherArray(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        System.arraycopy(nums, 0, nums2, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, nums2, 0, k);

        System.out.println(JSON.toJSON(nums2));
    }
    //复制数组 参考官网
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(JSON.toJSON(nums));
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
