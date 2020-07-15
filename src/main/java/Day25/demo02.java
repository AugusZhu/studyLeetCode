package Day25;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/7/14 22:23
 * @Revision: 1.0
 * @Description:
 */
public class demo02 {
    //func1
    public String reverseStr(String s) {
        char[] chr = s.toCharArray();
        StringBuffer resStr = new StringBuffer();
        for (int i = chr.length - 1; i >= 0; i--) {
            resStr.append(chr[i]);
        }
        return resStr.toString();

    }


    //
    private String reverseStr2(String str) {

        if (str.length() == 1) {
            System.out.println(str);
        } else {
            String subString1 = str.substring(0, str.length() - 1);
            String subString2 = str.substring(str.length() - 1);
            System.out.print(subString2);
            reverseStr2(subString1);
        }

        return null;

    }

    public static void main(String[] args) {
        demo02 d2 = new demo02();
        String s = "I am a student";

        System.out.println(d2.reverseStr(s));
    }
}
