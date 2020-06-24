/**
 * Created with IntelliJ IDEA.
 * User: liudidi
 * Date: 2020/5/7
 * Time: 10:12 上午
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{-3,4,3,90};
        int target = 0;
        int[] result = twoSum(nums, target);
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > target) {
//                continue;
//            }
            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] > target) {
//                    continue;
//                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
