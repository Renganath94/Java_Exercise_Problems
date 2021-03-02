import java.util.Arrays;

import java.util.Scanner;

public class ArraySort
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Array size: ");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("Elements: ");
            for(int i=0; i<size; i++)
                {
                    a[i] = sc.nextInt();
                }
                System.out.println("Whole pair of sum");
                int num = sc.nextInt();
                System.out.println("Present array is: "+Arrays.toString(a));
                System.out.println("Indices which gives the sum: "+num +" is");
                for(int i=0; i<a.length; i++)
                {
                    for (int j=i; j<a.length; j++)
                    {
                        if ((a[i] + a[j]) == num && i != j)
                        {
                            System.out.println(i + ", " + j);
                        }
                    }
                }

        }

}