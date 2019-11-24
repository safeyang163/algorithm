package com.leetcode;


import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 第五天
 * 两数之和
 * 感想：第一想法暴力解法，双重循环
 * 然后看了题解，一遍hash很省时间。争取以后多练练，能举一反三，加以运用。
 */
public class TwoNumbersSum {


    //1 回归昨天的题
    @Test
    public void testLastDay() {
        int[] nums1 = {2, 7, 11, 15};
//        int[] nums1 = {8, 9, 18, 0, 0, 0};
//        int[] nums2 = {1, 2, 7};
//        mergeArray(nums1, 3, nums2, 3);
//        System.out.println(JSONObject.toJSON(nums1));
//        sumArray(nums1,9);
        System.out.println(JSONObject.toJSON( sumArray(nums1,9)));
    }

    public int[] sumArray(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int c = target-nums[i];
            if(result.containsKey(c)){
                return new int[]{result.get(c),i};
            }else{
                result.put(nums[i],i);
            }
        }
        return  null;
    }

}
