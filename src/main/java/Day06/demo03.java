package Day06;

public class demo03 {

    /**
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     *
     * 示例 1：
     * 输入: n = 3
     * 输出: 6
     *
     * 示例 2：
     * 输入: n = 9
     * 输出: 45

     * 限制：1 <= n <= 10000
     */


    //方法一： 平均计算
    public int sumNums1(int n) {

        return (1+n)*n/2;
    }


    //方法二：迭代
    public int sumNums2(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    //方法三： 递归
    public int sumNums3(int n) {
        if (n == 1) {
            return 1;
        } else {
            n += sumNums3(n - 1);
        }
        return n;
    }

    /*代码：
    Java 中，为构成语句，需加一个辅助布尔量 xx ，否则会报错；
    Java 中，开启递归函数需改写为 sumNums(n - 1) > 0 ，此整体作为一个布尔量输出，否则会报错；
    初始化变量 resres 记录结果。（ Java 可使用第二栏的简洁写法，不用借助变量 resres ）。*/

    int res = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }



    public static void main(String[] args) {
        demo03 d3 = new demo03();
        System.out.println(d3.sumNums1(3));
        System.out.println(d3.sumNums2(3));
        System.out.println(d3.sumNums3(3));
        System.out.println(d3.sumNums(3));
    }
}
