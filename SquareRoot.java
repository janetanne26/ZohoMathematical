package zohoMathematical;

import java.util.Scanner;

public class SquareRoot {
    public static int findSqrtUsingBinarySearch(int x) {

        if(x < 2) {
            return x;
        }

        int start = 1;
        int end = x;

        while(start <= end) {

            int mid = (start + end)/2;

            if(mid*mid == x) {
                return mid;

            } else if (mid*mid > x) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }
        }

        return end;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x value");
        int x=sc.nextInt();
        int ans=findSqrtUsingBinarySearch(x);
        System.out.println("square root is "+ans);
    }
}
