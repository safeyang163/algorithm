package com.homestayManage;

/**
 * @Description: 第三天 链表合并
 * @Date: 2019/11/21 09:20
 * @Version: 1.0
 */
public class LinkedListMerge {

//    我们直接将以上递归过程建模，首先考虑边界情况。
//    特殊的，如果 l1 或者 l2 一开始就是 null ，那么没有任何操作需要合并，所以我们只需要返回非空链表。
//    否则，我们要判断 l1 和 l2 哪一个的头元素更小，然后递归地决定下一个添加到结果里的值。如果两个链表都是空的，那么过程终止，
//    所以递归过程最终一定会终止。
// 感想 ： 还是没有思路的锅。代码不难，就是没思路，参考官方给的思路写了一变

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
           l2.next =  mergeTwoLists(l1,l2.next);
            return l2;
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
