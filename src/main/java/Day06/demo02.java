package Day06;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/27 13:04
 * @Revision: 1.0
 * @Description:
 */

public class demo02 {

    public boolean isOdd(int a){
        //是奇数
        if(a%2 != 0){
            return true;
        }
        return false;
    }

    //我的算法
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
            if(!isOdd(str.length())){
                count ++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        demo02 d2 = new demo02();
        int [] nums= {555,901,482,1771};
        System.out.println(d2.findNumbers(nums));

    }
}
