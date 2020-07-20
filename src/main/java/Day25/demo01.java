package Day25;

import java.util.Scanner;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/7/14 17:05
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    //求两个数的最小公倍数

    // 最大公约数
    public static int get_gcd(int a, int b) {
        int max, min;
        max = (a > b) ? a : b;
        min = (a < b) ? a : b;

        if (max % min != 0) {
            return get_gcd(min, max % min);
        } else
            return min;

    }

    // 最大公约数
    public static int get_gcd2(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// 交换n1、n2的值
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        if (n1 % n2 == 0) {
            gcd = n2;
        }

        while (n1 % n2 > 0) {
            n1 = n1 % n2;
            if (n1 < n2) {
                n1 = n1 + n2;
                n2 = n1 - n2;
                n1 = n1 - n2;
            }
            if (n1 % n2 == 0) {
                gcd = n2;
            }
        }
        return gcd;

    }

    // 最小公倍数
    public static int get_lcm(int a, int b) {
        return a * b / get_gcd(a, b);
    }

    public static void main(String[] args) {
//        int n1 = 5;
//        int n2 = 7;
//        System.out.println("(" + n1 + "," + n2 + ")" + "=" + get_gcd(n1, n2));
//        System.out.println("[" + n1 + "," + n2 + "]" + "=" + get_lcm(n1, n2));
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(get_lcm(n1, n2));
        }
    }

}
