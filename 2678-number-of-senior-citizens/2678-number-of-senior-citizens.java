class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int res=Integer.parseInt(details[i].substring(11,13));
            if(res>60)
                c++;
        }
        return c;
    }
}