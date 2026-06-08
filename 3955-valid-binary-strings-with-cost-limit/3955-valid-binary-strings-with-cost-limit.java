class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ap = new ArrayList<>();

        int max = 1 << n;

        for (int j = 0; j < max; j++) {

            String res = String.format("%" + n + "s",
                         Integer.toBinaryString(j))
                         .replace(' ', '0');

            boolean valid = true;
            int sum = 0;

            for (int i = 1; i < res.length(); i++) {

                if (res.charAt(i) == '1' && res.charAt(i - 1) == '1') {
                    valid = false;
                    break;
                }

                if (res.charAt(i - 1) == '1') {
                    sum += (i-1);
                }
            }
            if(res.charAt(n-1)=='1' && valid){
                sum+=(n-1);
            }

            if (valid && sum <= k) {
                ap.add(res);
            }
        }

        return ap;
    }
}