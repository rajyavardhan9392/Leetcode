class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int i=0;i<digits.length;i++)
            freq[digits[i]]++;
        int c=0;
        for(int i=1;i<10;i++)
        {
            if(freq[i]==0)
                continue;
            freq[i]--;
            for(int j=0;j<10;j++)
            {
                if(freq[j]==0)
                    continue;
                freq[j]--;
                for(int k=0;k<10;k=k+2)
                {
                    if(freq[k]>0)
                        c++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        return c;
    }
}