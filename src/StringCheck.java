import java.util.Scanner;

public class StringCheck
{
    public static void main(String[] args)
    {
        String[] Names = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings to find the shortest and longest");
        for(int i=0; i<Names.length; i++)
        {
            Names[i] = sc.next();
        }

        String smallest = Names[0];
        for (int i = 1; i < Names.length; i++)
        {
            if (Names[i].length() < smallest.length()) {
                smallest = Names[i];
            }
        }
        System.out.println("The shortest first occurred string is: "+smallest);

        String Greatest = Names[0];
        for (int i = 1; i < Names.length; i++) {
            if (Names[i].length() > Greatest.length()) {
                Greatest = Names[i];
            }
        }
        System.out.println("The greatest first occurred string is: " +Greatest);


    }
}
