package liudi;

/**
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/6/15
 * Time: 5:49 下午
 * <p>
 * 6. Z 字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * <p>
 * https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class Q_6 {

    public static void main(String[] args) {
        String result = convert("a"
            , 1);
        System.out.println(result);
    }

    public static String convert(String s, int numRows) {
        if (s.length() == 1) {
            return s;
        }
        char[][] a = new char[s.length()][numRows];

        char[] c = s.toCharArray();
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (index >= s.length()) {
                    break;
                }
                if (i % (numRows - 1) == 0) {
                    a[i][j] = c[index++];
                } else {
                    int xx = numRows - (i % (numRows - 1)) - 1;
                    if (xx == j) {
                        a[i][j] = c[index++];
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
                char x = a[i][j];
                if (x > 0) {
                    sb.append(x);
                }

            }
        }
        return sb.toString();
    }
}
