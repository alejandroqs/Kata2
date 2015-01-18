package kata2;

import java.util.HashMap;

public class kata2B {

    public static void main(String[] args) {
        int[] numbers = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, getFrequency(number, frequencyMap)+1);
        }
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key +" ->" + frequencyMap.get(key));
        }
    }
    private static int getFrequency(int number, HashMap<Integer, Integer> frequencyMap) {
        if (frequencyMap.containsKey(number)) {
            return frequencyMap.get(number);
        }
        return 0;
    }
}