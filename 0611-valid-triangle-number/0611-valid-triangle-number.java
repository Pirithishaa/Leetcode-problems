class Solution {
    public int triangleNumber(int[] n) {
        Arrays.sort(n);
        int m=n.length;
        int count=0;
        for(int i=m-1;i>=2;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(n[l]+n[r]>n[i]){
                    count+=(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
            
        }
        return count;

    }
}