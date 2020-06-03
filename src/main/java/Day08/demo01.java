package Day08;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/30 20:47
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    //未成功解答
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if (c == 0) {
                c = 26;
                n -= 1;
            }
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        demo01 d1 = new demo01();
        int num = 701;
        String excelTitle =  d1.convertToTitle(num);


        System.out.println(excelTitle);

    }
}
