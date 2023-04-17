package algorithm;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * 解析： 递归  进制
 */
public class Main2 {

    class ListNode {
        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        if (list1 == null) list1 = new ListNode(0);
        if (list2 == null) list2 = new ListNode(0);

        int sum = list1.val + list2.val;

        if (sum > 9) {
            int val = sum % 10;

            int next = sum / 10;

            if(list1.next == null){
                list1.next = new ListNode(0);
            }

            list1.next.val += next;

            return new ListNode(val, addTwoNumbers(list1.next, list2.next));
        }

        return new ListNode(sum, addTwoNumbers(list1.next, list2.next));

    }

    public void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.setVal(10);

    }


}
