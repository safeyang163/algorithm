package com.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * 第四天
 * 有序数组合并
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

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
