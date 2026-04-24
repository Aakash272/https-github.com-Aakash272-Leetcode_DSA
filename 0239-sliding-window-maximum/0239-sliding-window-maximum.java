 class Solution {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // remove out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // store answer
            if (i >= k - 1) {
                res[idx++] = arr[dq.peekFirst()];
            }
        }

        return res;
    }
}