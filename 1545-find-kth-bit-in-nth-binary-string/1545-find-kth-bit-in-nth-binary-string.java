class Solution {

    public String invert(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }
        return ans.toString();
    }

    public char findKthBit(int n, int k) {

        StringBuilder res = new StringBuilder("0");

        for (int i = 2; i <= n; i++) {
            String prev = res.toString();
            String inverted = invert(prev);
            String reversed = new StringBuilder(inverted).reverse().toString();

            res.append("1").append(reversed);
        }

        return res.charAt(k - 1);
    }
}