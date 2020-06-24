package liudi;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/6/23
 * Time: 10:34 上午
 */
public class Q_9 {

    public static void main(String[] args) {
        boolean r = isPalindrome(1221);
        System.out.println();
    }

    public static boolean isPalindrome(int num) {
        if (num < 0){
            return false;
        }

        int r= 0;
        int temp = num;
        do {
            int y = temp % 10;
            temp = temp / 10;
            r = r * 10 + y;
        } while (temp > 0);

        return r == num;
    }
}
