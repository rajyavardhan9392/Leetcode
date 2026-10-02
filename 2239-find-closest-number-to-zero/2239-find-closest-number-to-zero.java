class Solution {
    public int findClosestNumber(int[] nums) {
        int best=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(Math.abs(nums[i])<Math.abs(best) || (Math.abs(nums[i])==Math.abs(best) && nums[i]>best))
                best=nums[i];
        }
        return best;
    }
}