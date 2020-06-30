package Day19;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/23 22:20
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }

    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int n = 10;
        System.out.println(d1.cuttingRope(10));
    }
}
