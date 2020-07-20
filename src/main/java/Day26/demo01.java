package Day26;

import java.util.Arrays;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/7/20 13:57
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    //二分查找
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }


    //双指针算法
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int[] numbers = {2, 7, 11, 15, 17, 18, 19, 45, 56, 89};
        int target = 9;
        System.out.println(Arrays.toString(d1.twoSum(numbers, target)));
    }
}
