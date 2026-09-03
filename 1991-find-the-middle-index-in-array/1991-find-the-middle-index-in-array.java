class Solution {
    public int findMiddleIndex(int[] nums) {
        int t=0,l=0,n=nums.length;
        for(int i=0;i<n;i++)
            t=t+nums[i];
        for(int i=0;i<n;i++)
        {
            int r=t-l-nums[i];
            if(r==l)
                return i;
            l=l+nums[i];
        }
        return -1;
    }
}