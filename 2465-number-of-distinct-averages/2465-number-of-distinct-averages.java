class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s=new HashSet<>();
        int l=0,r=nums.length-1;
        while(l<r)
        {
            s.add(nums[l]+nums[r]);
            l++;
            r--;
        }
        return s.size();
    }
}