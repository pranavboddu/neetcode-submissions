class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        if(nums.length>set.size()){
            return true;
        }
        return false;
        
    }
}