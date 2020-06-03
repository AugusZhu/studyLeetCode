package Day07;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/28 21:47
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {
    //思路就是递归  消耗太大
    public int fib(int n) {
        int res = 0;
        if (n == 0 || n == 1) {
            res = n;
        } else {
            res = fib(n - 1) + fib(n - 2);
        }
        return res;

    }


    //没懂，待进一步理解
    public int fib1(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int r = d1.fib(43);
        System.out.println(r);

    }
}
