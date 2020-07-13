package Day23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/7/10 22:05
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    private static final Logger logger = LoggerFactory.getLogger(demo01.class);

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }


    public int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int f0 = -prices[0];
        int f1 = 0;
        int f2 = 0;
        for (int i = 1; i < n; ++i) {
            int newf0 = Math.max(f0, f2 - prices[i]);
            int newf1 = f0 + prices[i];
            int newf2 = Math.max(f1, f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }

        return Math.max(f1, f2);
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int[] prices = {1, 2, 3, 0, 2, 3, 4, 0, 3};

        logger.info("---------开始执行---------");
        String rs1 = Integer.toString(d1.maxProfit(prices));
        String rs2 = Integer.toString(d1.maxProfit2(prices));
        logger.info(rs1);
        logger.info(rs2);
        logger.info("---------执行结束---------");


    }

}
