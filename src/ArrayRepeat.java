import java.util.*;

public class ArrayRepeat
{

    static int getArrayRepeat(int array[])
    {

        int minimumIndex = -1;
        HashSet<Integer> set = new HashSet<>();


        for (int i=array.length-1; i>=0; i--)
        {

            if (set.contains(array[i]))
                minimumIndex = i;

            else
                set.add(array[i]);
        }
        return minimumIndex;
    }

    public static void main (String[] args)
    {
        int array[] = {11, 12, 4, 12, 4, 1, 1};
        int min=getArrayRepeat(array);

        if (min != -1)
            System.out.println("1st repeat  " + array[min]);
        else
            System.out.println("No repeat elements");
    }
} 
 