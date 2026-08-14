class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int j=Math.abs(nums[i])-1;
            if(nums[j]<0)
                res.add(Math.abs(nums[i]));
            else
                nums[j]=-nums[j];
        }
        return res;
    }
}