package Day29;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/8/2 21:10
 * @Revision: 1.0
 * @Description:
 */
public class demo03 {

    /**
     * 一个数字 去掉几位数字后的最小值
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            int b = in.nextInt();
            System.out.println(removeStr(a, b));
        }
    }


    public static String removeStr(String num, int k) {
        LinkedList<Character> stack = new LinkedList<Character>();

        for (char dight : num.toCharArray()) {
            while (stack.size() > 0 && k > 0 && stack.peekLast() > dight) {
                stack.removeLast();
                k -= 1;
            }
            stack.addLast(dight);
        }

        StringBuilder ret = new StringBuilder();
        boolean leadZero = true;

        for (char dight : stack) {
            if (leadZero && dight == '0') {
                continue;
            }
            leadZero = false;
            ret.append(dight);
        }

        if (ret.length() == 0) {
            return "0";
        }
        return ret.toString();

    }
}
