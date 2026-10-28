class Solution {
    public int strStr(String haystack, String needle) {
        int t=haystack.length();
        for(int i=0;i<=t-needle.length();i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}