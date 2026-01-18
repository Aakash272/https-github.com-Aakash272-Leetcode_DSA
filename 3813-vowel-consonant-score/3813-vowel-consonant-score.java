class Solution {
    public int vowelConsonantScore(String s) {

        s = s.trim().toLowerCase();
        int n = s.length();

        int v = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                v++;
            } 
            else if (Character.isLetter(ch)) {
                c++;
            }
        }

        if (c == 0) {
            return 0;
        }

        double avg = (double) v / c;
        return (int) Math.floor(avg);
    }
}
