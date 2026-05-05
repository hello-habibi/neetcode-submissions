class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 1, len = 1;
        if (n == 0) return 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            } else if (nums[i + 1] == nums[i] + 1) {
                len++;
                ans = Math.max(ans, len);
            } else {
                len = 1;
            }
        }
        return ans;
    }
}