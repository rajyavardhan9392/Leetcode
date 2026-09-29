class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0,num=1;
        for(int i=0;i<arr.length;i++)
        {
            while(num<arr[i])
            {
                count++;
                if(count==k)
                    return num;
                num++;
            }
            num++;
        }
        while(count<k)
        {
            count++;
            num++;
            if(count==k)
                return num-1;
        }
        return -1;
    }
}