class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int i = 0;i<nums.length;i++) {
            total = total + nums[i];
        }

        int left = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left = left + nums[i];
            int right = total - left;
            if (Math.abs(right - left) % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }
}
