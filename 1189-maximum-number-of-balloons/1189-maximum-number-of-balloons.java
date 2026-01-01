class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> ap = new HashMap<>();

        for (char c : text.toCharArray()) {
            ap.put(c, ap.getOrDefault(c, 0) + 1);
        }

        int b = ap.getOrDefault('b', 0);
        int a = ap.getOrDefault('a', 0);
        int l = ap.getOrDefault('l', 0) / 2;
        int o = ap.getOrDefault('o', 0) / 2;
        int n = ap.getOrDefault('n', 0);

        return Math.min(b,
               Math.min(a,
               Math.min(l,
               Math.min(o, n))));
    }
}
