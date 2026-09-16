class Solution {
    int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++)
        {
            s1=s1+nums[i];
            s2=s2+sum(nums[i]);
        }
        return Math.abs(s1-s2);
    }
}