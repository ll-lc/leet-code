/**
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/5/6
 * Time: 9:25 下午
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q_2 {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
//        a.next = new ListNode(4);
//        a.next.next = new ListNode(3);
        ListNode b = new ListNode(9);
        b.next = new ListNode(9);
//        b.next.next = new ListNode(4);

        ListNode x = addTwoNumbers(a, b);
        System.out.println(x.toString());

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l11 = l1;
        ListNode l22 = l2;

        ListNode r = null;
        ListNode r1 = null;

//        int result = 0;
        int jin = 0;


        while (l11 != null || l22 != null) {
            int l1v = l11 == null ? 0 : l11.val;
            int l2v = l22 == null ? 0 : l22.val;
            int r0 = l1v + l2v + jin;
            if (r0 >= 10) {
                r0 = r0 - 10;
            }

            if (r == null) {
                r = new ListNode(r0 );
                r1 = r;
            } else {
                r1.next = new ListNode(r0 );
                r1 = r1.next;
            }
            if (l1v + l2v + jin >= 10) {
                jin = 1;
            } else {
                jin = 0;
            }
            l11 = l11 == null ? null : l11.next;
            l22 = l22 == null ? null : l22.next;

        }

        if (jin > 0){
            r1.next = new ListNode(jin);
        }

        return r;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + " " + (next == null ? "" : next.toString());
        }
    }
}
