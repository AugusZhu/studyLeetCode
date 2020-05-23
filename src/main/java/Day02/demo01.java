package Day02;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/23 20:32
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    /**
     * 题目描述
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     *
     * 示例 1：
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     *
     * 示例 2：
     * 输入: s = "lrloseumgh", k = 6
     * 输出: "umghlrlose"
     */

    public String reverseLeftWords(String s, int n) {

        //左边的字符
        String leftWords = s.substring(0,n);
        //右边的字符
        String rightWords = s.substring(n,s.length());
        String resWords = rightWords+leftWords;
        return resWords;

    }


    public static void main(String[] args) {
        demo01 d = new demo01();

        String str = d.reverseLeftWords("abcdefg",2);

        System.out.println(str);
    }
}
