package L3_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(18);
        arr.add(22);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(1,15); // arr[1] = 15;
        System.out.println(arr); // Whole array list is printed {backend main looping}

        arr.add(1,100);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
