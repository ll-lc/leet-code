/**
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/5/6
 * Time: 7:43 下午
 * <p>
 * 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。
 * <p>
 * 火车票有三种不同的销售方式：
 * <p>
 * 一张为期一天的通行证售价为 costs[0] 美元；
 * 一张为期七天的通行证售价为 costs[1] 美元；
 * 一张为期三十天的通行证售价为 costs[2] 美元。
 * 通行证允许数天无限制的旅行。 例如，如果我们在第 2 天获得一张为期 7 天的通行证，那么我们可以连着旅行 7 天：第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。
 * <p>
 * 返回你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-cost-for-tickets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q_983 {

    //    [1,4,6,9,10,11,12,13,14,15,16,17,18,20,21,22,23,27,28]
//        [3,13,45]
    public static void main(String[] args) {
        int result = mincostTickets(
            new int[]{1, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 27, 28},
            new int[]{3, 13, 99});
        System.out.println(result);
    }

    public static int mincostTickets(int[] days, int[] costs) {

        int[] price = new int[366];

        price[0] = 0;

        int index = 0;

        for (int i = 1; i < 366; i++) {

            if (index >= days.length || days[index] != i) {
                price[i] = price[i - 1];
                continue;
            }

            index++;

            int month = price[i - Math.min(i, 30)]  + costs[2];
            int week = price[i - Math.min(i, 7)]  + costs[1];
            int day = price[i - Math.min(i, 1)]  + costs[0];

            price[i] = Math.min(
                Math.min(
                    month, week),
                day);

            System.out.println(i + "\t" + price[i]);
        }
        return price[365];
    }

//    private int getIndex(int i, int i2) {
//        if (i - i2 < 0) {
//
//        }
//
//    }
}
