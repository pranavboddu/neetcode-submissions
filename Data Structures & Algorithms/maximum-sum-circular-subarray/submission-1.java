class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int curMax = 0, maxSoFar = Integer.MIN_VALUE;
        int curMin = 0, minSoFar = Integer.MAX_VALUE;
        
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSoFar = Math.max(maxSoFar, curMax);
            
            curMin = Math.min(curMin + num, num);
            minSoFar = Math.min(minSoFar, curMin);
            
            total += num;
        }
        
        if (maxSoFar < 0) {
            return maxSoFar;
        }
        
        return Math.max(maxSoFar, total - minSoFar);
    }
}