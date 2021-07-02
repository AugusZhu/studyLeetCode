package com.basic;


import java.math.BigDecimal;
import java.util.Objects;

public class one {

    public static void main(String[] args) {

        one o = new one();
        //function 1
        //o.compareBigDecimalOld();


        //function 2
        //o.compareBigDecimal();

        //function 3
        o.setScaleFunc();

    }

    //具有基本数学知识的我们很清楚的知道输出并不是我们想要的结果（精度丢失），我们如何解决这个问题呢？

    /**
     * @desc 一种很常用的方法是：使用 BigDecimal 来定义浮点数的值，再进行浮点数的运算操作。
     */

    private void compareBigDecimalOld() {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);

        System.out.println(x); /* 0.1 */
        System.out.println(y); /* 0.1 */
        System.out.println(Objects.equals(x, y)); /* true */

    }

    /**
     *  a.compareTo(b) : 返回 -1 表示 a 小于 b，0 表示 a 等于 b ， 1表示 a 大于 b。
     */
    private void compareBigDecimal(){
        BigDecimal a = new BigDecimal("1.000000");
        BigDecimal b = new BigDecimal("0.9999999");
        System.out.println(a.compareTo(b));// 1

    }


    /**
     * 通过 setScale方法设置保留几位小数以及保留规则。保留规则有挺多种，不需要记，IDEA会提示。
     */

    private void setScaleFunc(){
        BigDecimal m = new BigDecimal("0.9999987");
        BigDecimal n = m.setScale(3,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(m);
        System.out.println(n);

    }
}
