class Solution {
    public boolean isFascinating(int n) {
        int[] a=new int[10];
        int x=2*n;
        int y=3*n;
        while(n>0)
        {
            a[n%10]++;
            n=n/10;
        }
        while(x>0)
        {
            a[x%10]++;
            x=x/10;
        }
        while(y>0)
        {
            a[y%10]++;
            y=y/10;
        }
        if(a[0]!=0)
            return false;
        for(int i=1;i<10;i++)
        {
            if(a[i]!=1)
                return false;
        }
        return true;
    }
}