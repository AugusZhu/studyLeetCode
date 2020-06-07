package Day12;

import java.util.Arrays;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/7 10:40
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {
    //我的算法 暴力循环比较
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if (isExists(nums, target)) {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    index = i;
                }
            }
        } else {
            for (int j = 0; j < nums.length; j++) {
                //当小于数组最小值
                if (target < nums[0]) {
                    index = 0;
                } else if (target > nums[nums.length-1]) {
                    //当大于数组最大值
                    index = nums.length ;
                } else if (target > nums[j] && target < nums[j + 1]) {
                    index = j + 1;
                }
            }
        }
        return index;
    }

    public boolean isExists(int[] nums, int target) {
        int a = Arrays.binarySearch(nums, target);
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 二分查找法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }




    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int rowIndex = d1.searchInsert1(nums, target);

        System.out.println(rowIndex);
    }
}
