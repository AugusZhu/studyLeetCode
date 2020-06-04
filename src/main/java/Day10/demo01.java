package Day10;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/4 22:45
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    //未成功解答
    /*方法一：二分查找
    我们可以首先枚举 a，并保证 c - a^2 >= 0，随后我们通过二分查找的方法找出是否存在 b，满足 b^2 = c - a^2。二分查找的范围为 [0, c - a^2]。*/

    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int)(a * a);
            if (binary_search(0, b, b))
                return true;
        }
        return false;
    }
    public boolean binary_search(long s, long e, int n) {
        if (s > e)
            return false;
        long mid = s + (e - s) / 2;
        if (mid * mid == n)
            return true;
        if (mid * mid > n)
            return binary_search(s, mid - 1, n);
        return binary_search(mid + 1, e, n);
    }


    //方法二：使用 sqrt 函数  求算数平方根
    //在枚举 a 之后，我们也可以直接使用 sqrt 函数直接找出 b。
    //a*a + b*b = c
    public boolean judgeSquareSum1(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int c = 3;

        System.out.println(d1.judgeSquareSum1(c));
    }



}
