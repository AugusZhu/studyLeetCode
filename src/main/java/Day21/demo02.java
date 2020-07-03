package Day21;

import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/30 21:10
 * @Revision: 1.0
 * @Description:
 */
public class demo02 {
    //private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(demo02.class);

    //我的算法 错的
    public int[] runningSum(int[] nums) {
        int[] sumNums= new int[nums.length];
        int sum = 0;
            for (int j = 0; j < sumNums.length; j++) {
                for (int i = 0; i <nums.length ; i++) {

                    sum += nums[i];
                sumNums[j] = sum;
                //LOGGER.info(String.valueOf(sumNums[j]));

            }
        }

        return sumNums;
    }

    public int[] runningSum1(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i ++){
            res[i] = res[i - 1] + nums[i];}
        return res;
    }



    public static void main(String[] args) {
        demo02 d2 = new demo02();
        int[] nums ={1,2,3,4};

        System.out.println(Arrays.toString(d2.runningSum(nums))  );
    }
}
