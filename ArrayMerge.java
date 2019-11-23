package com.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * 第四天
 * 有序数组合并
 * 感想 ： 一开始有点思路写完了，普通的也测试过了，但是leetcode一提交给了几个临界值就报错了，希望自己以后能考虑的全面点，
 * 努力加油，以后能多练练，多看看
 */

public class ArrayMerge {

    @Test
    public void test() {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {4,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(JSONObject.toJSON(nums1));
    }
    //nums1 = [1,2,7,0,0,0], m = 3
    //nums2 = [2,5,6],       n = 3
    /*
     *   1  [123000]
     * */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1, b = n - 1, temp = m + n - 1;
        while (a >= 0 && b >= 0) {
            if (nums1[a] < nums2[b]) {
                nums1[temp] = nums2[b];
                b--;
            }else{
                nums1[temp] = nums1[a];
                a--;
            }
            temp--;
            System.out.println(b);
        }
        System.arraycopy(nums2, 0, nums1, 0, b+1);
    }

}
