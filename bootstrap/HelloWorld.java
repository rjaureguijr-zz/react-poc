import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
   /* public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }*/

    public void printRepeats(int[1, 2,3,4,2,1,3,4,5,6,1,2,12,1,2,1,2]numbers, int repeated) {
        HashMap<Integer, Integer> numToCount = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (numToCount.containsKey(num)) {
                numToCount.put(num, numToCount.get(num) + 1);
            } else {
                numToCount.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numToCount.entrySet()) {
            if (entry.getValue() == repeated) {
                System.out.println(entry.getKey());
            }
        }
    }
}