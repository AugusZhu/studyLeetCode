package Day29;

import java.util.Scanner;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/8/2 20:25
 * @Revision: 1.0
 * @Description:
 */
public class demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DeviInt(n));

    }

    public  static int DeviInt(int num){
        int count = 0,sum = 0,start,end;
        for(int i=1;i<=num/2;i++){
            start = i;
            sum =0;
            end =0;
            for(int j =start;j<=num;j++){
                if((sum+j)<num){
                    sum+=j;
                }else if(sum+j == num){
                    end = j;
                    print(start,end);
                    count++;
                }else{
                    break;
                }

            }

        }
        //等于本身+1
        return  count+1;

    }

    public static  void  print(int start,int end){
        while (start<end){
            System.out.print(start+"+");
            start++;
        }
        System.out.println(end);
    }
}
