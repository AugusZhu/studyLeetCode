package Day03;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/24 17:57
 * @Revision: 1.0
 * @Description:
 */
public class demo03 {
    /**
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     * <p>
     * 示例 1：
     * <p>
     * 输入：n = 234
     * 输出：15
     * 解释：
     * 各位数之积 = 2 * 3 * 4 = 24
     * 各位数之和 = 2 + 3 + 4 = 9
     * 结果 = 24 - 9 = 15
     */
    public int subtractProductAndSum(int n) {
        int muti = 1;
        int sum = 0;
        while (n != 0) {
            muti *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return muti - sum;

    }

    public static void main(String[] args) {
        demo03 d3 = new demo03();
        int resultNum = d3.subtractProductAndSum(4421);

        System.out.println(resultNum);
    }

}
