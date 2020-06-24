/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/6/17
 * Time: 7:43 下午
 */
public class Q_7 {

    public static void main(String[] args) {
        int x = -2147483648;
        int r = reverse(x);
        System.out.println(r);
    }

    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }

        boolean f = false;
        if (x < 0) {
            f = true;
            x = x * -1;
        }

        long r = 0L;
        do {
            int b = x % 10;
            x = x / 10;
            r = r * 10 + b;

        } while (x > 0);

        if (f) {
            r = r * -1;
        }


        return r > Integer.MAX_VALUE || r < Integer.MIN_VALUE ? 0 : (int) r;
    }

}
