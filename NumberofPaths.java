package zohoMathematical;

import java.util.Scanner;

public class NumberofPaths {

        static int numberOfPaths(int m, int n)
        {

            if (m == 1 || n == 1)
                return 1;


            return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);

        }

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the row value");
            int row=sc.nextInt();
            System.out.println("enter column values");
            int col=sc.nextInt();
            System.out.println(numberOfPaths(row,col));
        }


}
