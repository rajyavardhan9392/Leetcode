class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,c=0,min=nums[0],max=nums[n-1];
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>min && nums[i]<max)
                c++;
        }
        return c;
    }
}