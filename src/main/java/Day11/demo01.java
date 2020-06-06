package Day11;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/6 21:00
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {


    /**
     * 我的解法 不正确 考虑不全面
     * 多种情况：1）空格在字符串末尾   2）空格在字符串中间  3）没有空格
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord1(String s) {
        int len;
        int result = s.indexOf(" ");
        if (result != -1) {
            String rightStr = s.substring(s.lastIndexOf(" ") + 1);
            len = rightStr.length();
        } else {
            len = s.length();
        }
        return len;
    }


    /**
     * @param s
     * @return 先从后过滤掉空格找到单词尾部，再从尾部向前遍历，找到单词头部，最后两者相减，即为单词的长度 时间复杂度：O(n)，n为结尾空格和结尾单词总体长度
     */
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        String s = "a ";
        System.out.println(d1.lengthOfLastWord(s));
    }
}
