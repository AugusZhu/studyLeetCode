package Day20;


import java.util.HashMap;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/24 14:39
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    HashMap<Integer, Integer> map = new HashMap();

    public int numWays(int n) {
        if (n < 2) {
            return 1;
        }
        //先判断有没计算过
        if (map.containsKey(n)) {
            //计算过，直接返回
            return map.get(n);
        } else {
            // 没有计算过，递归计算,并且把结果保存到map中
            map.put(n, (numWays(n - 1) + numWays(n - 2)) % 1000000007);
            return map.get(n);
        }
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int n = 7;

        System.out.println(d1.numWays(n));
    }

}
