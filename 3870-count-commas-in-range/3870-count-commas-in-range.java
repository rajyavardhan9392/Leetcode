class Solution {
    public int countCommas(int n) {
        long res=0;
        long p=1000;
        while(p<=n)
        {
            res+=(long)n-p+1;
            p=p*1000;
        }
        return (int)res;
    }
}