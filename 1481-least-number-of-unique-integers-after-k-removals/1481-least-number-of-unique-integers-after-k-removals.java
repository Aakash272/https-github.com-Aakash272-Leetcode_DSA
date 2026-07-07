import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> hp = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(hp.entrySet());

        Collections.sort(ls, (a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (Map.Entry<Integer, Integer> entry : ls) {

            int freq = entry.getValue();

            if (k >= freq) {
                k -= freq;
                hp.remove(entry.getKey());
            } else {
                break;
            }
        }

        return hp.size();
    }
}