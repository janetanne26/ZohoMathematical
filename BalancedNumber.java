package zohoMathematical;

import java.util.Scanner;

public class BalancedNumber {
    public static boolean checkBalNum(String str) {
        int r = 0;

        for (int i = 0; i < str.length()/2; i++) {
            r = r * 10 + str.charAt(i) - 48;

        }
      //  System.out.println(r);

        int m=0;

        for (int i = str.length()/2+1; i < str.length(); i++) {
            m = m * 10 + str.charAt(i) - 48;

        }
      //  System.out.println(m);

        int val=0;
        int sum1=0;
        while(r>0){
            val=r%10;
            sum1=sum1+val;
            r=r/10;
        }
       // System.out.println(sum1);
        int sum2=0;
        while(m>0){
            val=m%10;
            sum2=sum2+val;
            m=m/10;
        }
       // System.out.println(sum2);
        if(sum1==sum2){
            return true;
        }


        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string value");
        String str=sc.next();
        System.out.println(checkBalNum(str));
    }
}
