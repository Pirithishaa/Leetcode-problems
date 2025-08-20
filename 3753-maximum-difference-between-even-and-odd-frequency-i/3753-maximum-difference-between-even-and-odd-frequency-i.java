class Solution {
    public int maxDifference(String s) {
        int n=0,n1=s.length();
        int[] a=new int[26];
        char[]ch=s.toCharArray();
        for(char c:ch){
            a[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]%2!=0){
                n=Math.max(n,a[i]);
            }
            if(a[i]%2==0 && a[i]>0){
                n1=Math.min(n1,a[i]);
            }
        }
        return n-n1;
    }
}