class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        res.put(nums[0], 0);

        for(int i=1;i<nums.length;i++){
            if(res.containsKey(target-nums[i])){
                return new int[]{res.get(target-nums[i]), i};
            }
            res.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
