class Solution {

    boolean helper(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= m - n; i++) {

            String a = s2.substring(i, i + n);

            if (helper(s1, a)) {
                return true;
            }
        }

        return false;
    }
}