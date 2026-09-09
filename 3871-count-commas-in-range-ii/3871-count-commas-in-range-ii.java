class Solution {
    public long countCommas(long n) {
        long res=0,p=1000;
        while(p<=n)
        {
            res=res+n-p+1;
            if(p>Long.MAX_VALUE/1000)
                break;
            p=p*1000;
        }
        return res;
    }
}