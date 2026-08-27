class Solution {
    public int majorityElement(int[] nums) {
        int res=0,count=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
                res=nums[i];
            if(nums[i]==res)
                count++;
            else
                count--;
        }
        return res;
    }
}