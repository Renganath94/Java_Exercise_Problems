import java.util.*;
public class FirstLast
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().toUpperCase().split(";");

        Map<String,TreeSet<String>> hm=new TreeMap<>();

        for(String i:s){

            String[] a=i.split(":");
            if(!hm.containsKey(a[1]))
            {
                TreeSet<String> set=new TreeSet<String>();
                set.add(a[0]);
                hm.put(a[1],set);
            }
            else
                {
                TreeSet<String> set=hm.get(a[1]);
                set.add(a[0]);
                hm.put(a[1],set);
            }
        }
        for(String i:hm.keySet())
        {
            for(String j:hm.get(i)) {
                System.out.print("("+i);
                System.out.print(","+j + ")");
            }
        }
    }
}