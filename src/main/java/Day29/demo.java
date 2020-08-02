package Day29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/8/2 19:45
 * @Revision: 1.0
 * @Description:
 */
public class demo {

    /**
     *NTSEDXQOKPUVGIFWHJCLYMARZB
     * ABC
     *
     *
     * 32
     *
     * N A B C
     */

    public int costTime(String s1,String s2) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        StringBuffer output = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == s1.charAt(i)) {
                        continue;
                    }
                count++;

            }
        }
        return count;

    }


    public static void main(String[] args) throws  Exception{
        demo d1 = new demo();
        String s3= "NTSEDXQOKPUVGIFWHJCLYMARZB";
        String s4 = "ABC";

        System.out.println(d1.costTime(s3,s4));

    }





}
