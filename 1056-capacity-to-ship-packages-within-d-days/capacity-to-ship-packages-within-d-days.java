class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int val : weights) {
            left = Math.max(left, val);
            right += val;
        }
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (possible(weights, days, mid)) {
                ans = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static boolean possible(int[] weights, int days, int k) {
        int d = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum > k) {
                sum = weights[i];
                d++;
            }
        }
        return d <= days;

    }
}