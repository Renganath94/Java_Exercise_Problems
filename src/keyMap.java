
import java.util.*;

public class keyMap
{


    public static <K extends Comparable<K>, V> Map.Entry<K, V>

    getMaxEntryInMapBasedOnKey(Map<K, V> map)
    {

        Map.Entry<K, V> entryWithMaxKey = null;



        for (Map.Entry<K, V> currentEntry : map.entrySet()) {

            if (entryWithMaxKey == null || currentEntry.getKey().compareTo(entryWithMaxKey.getKey()) > 0)
            {
                entryWithMaxKey = currentEntry;
            }
        }
        return entryWithMaxKey;
    }


    public static void print(Map<String, Integer> map)
    {

        System.out.print("Map: ");


        if (map.isEmpty())
        {
            System.out.println("[]");
        }

        else

            {
            System.out.println(map);
        }
    }


    public static void main(String[] args)
    {

        Map<String, Integer> map = new HashMap<>();

        map.put("ABC", 10);
        map.put("DEF", 30);
        map.put("XYZ", 20);

        print(map);

        System.out.println("Entry with highest key: " + getMaxEntryInMapBasedOnKey(map));
    }
}
