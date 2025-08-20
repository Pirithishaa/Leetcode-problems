class Solution {
    public int minNumberOperations(int[] t) {
       int n=t.length;
       int x=t[0];
       for(int i=0;i<n-1;i++){
        if(t[i+1]>t[i]){
            int a=t[i+1]-t[i];
            x+=a;
        }
       }
       return x;
    }
}