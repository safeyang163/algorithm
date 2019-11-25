package com.homestayManage;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Package: com.homestayManage
 * @Author: HP
 * @Description: 第六天  数组末尾数加一
 * @Date: 2019/11/25 09:27
 * @Version: 1.0
 */
public class PlusOne {
    //    给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//    你可以假设除了整数 0 之外，这个整数不会以零开头。
    @Test
    public void test() {
        int[] ints = plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
//        System.out.println(1 % 10);
        System.out.println(JSONObject.toJSONString(ints));
//        splitNum(9);
    }


    //转成数字然后加1在拆解成数组 数组长度过长超出int最大值
    public int[] plusOne(int[] digits) {
        int temp = 0;
        for (int i = 0; i < digits.length; i++) {
            temp += digits[i] * Math.pow(10, digits.length -1-i);
        }
        temp++;
        //1236
        int length = new Integer(temp).toString().length();
        int[] r = new int[length];
        while (temp > 0) {
            if (temp == 10) {
                r[--length] = 0;
                temp = 1;
            } else {
                r[--length] = temp % 10;
                temp = temp / 10;
            }
        }
        return r;
    }

    public void splitNum(int nums) {
        while (nums > 0) {
            System.out.println(nums % 10);
            nums = nums / 10;
        }
    }

    // 从最后一位循环加一只要不进位就直接返回即可  这是看完题解后的解法
    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
