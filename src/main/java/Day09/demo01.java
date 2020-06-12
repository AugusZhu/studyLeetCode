package Day09;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/3 23:22
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    public int countSegments(String s) {

        //计算单词的数量，就等同于计数单词开始的下标个数。因此，只需要定义好下标的条件，就可以遍历整个字符串，检测每个下标。定义如下：若该下标前为空格（或者为初始下标），且自身不为空格，则其为单词开始的下标。该条件可以以常数时间检测。最后，返回满足条件的下标个数。
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }
        return segmentCount;

    }

    public static void main(String[] args) {
        demo01 d1 = new demo01();
        String str = "Hello, my name is John";
        int count = d1.countSegments(str);

        System.out.println(count);
    }
}
