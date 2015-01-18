package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] vector = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        int value;
        for (int i = 0; i < vector.length; i++) {
            if (!map.containsKey(vector[i])) {
                map.put(vector[i], 1);
            } else {
                value = map.get(vector[i]);
                map.put(vector[i], value + 1);
            }
        }
        for (Integer frecuency : map.keySet()) {
            System.out.print(frecuency + "->");
            System.out.println(map.get(frecuency));
        }

    }

}
