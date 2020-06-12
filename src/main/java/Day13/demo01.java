package Day13;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/6/11 23:59
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];

    }

    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int [] numbers = {3,4,5,1,2};
        System.out.println(d1.minArray(numbers));
    }
}
