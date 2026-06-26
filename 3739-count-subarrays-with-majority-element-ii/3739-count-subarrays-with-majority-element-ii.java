class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;

        // Prefix sums are in [-n, n]
        int offset = n + 2;
        int size = 2 * n + 5;

        Fenwick bit = new Fenwick(size);

        int prefix = 0;
        long ans = 0;

        // Empty prefix
        bit.add(offset, 1);

        for (int x : nums) {
            if (x == target) {
                prefix++;
            } else {
                prefix--;
            }

            int idx = prefix + offset;

            // Count previous prefix sums < current prefix sum
            ans += bit.query(idx - 1);

            bit.add(idx, 1);
        }

        return ans;
    }

    static class Fenwick {
        int[] tree;

        Fenwick(int n) {
            tree = new int[n + 2];
        }

        void add(int i, int delta) {
            while (i < tree.length) {
                tree[i] += delta;
                i += i & -i;
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        
}
          

    }
}