class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];
        for(int i=0;i<nums1.length;i++)
        {
            freq[nums1[i]]=1;
        }
        int temp[]=new int[1001];
        int k=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(freq[nums2[i]]==1)
            {
                temp[k]=nums2[i];
                k++;
                freq[nums2[i]]=0;
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=temp[i];
        }
        return res;
    }
}