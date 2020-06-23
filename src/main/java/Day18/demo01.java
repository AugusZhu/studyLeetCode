package Day18;

import java.util.Arrays;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/23 10:39
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {
    //一
    public int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }


    public static void main(String[] args) {
        demo01 d1 =new demo01();
        int n = 1;
        System.out.println(Arrays.toString(d1.printNumbers(n)));
    }
}
