class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int x=9;
        int y=10;
        if(n==0)return 1;
        for(int i=2;i<=n;i++){
            x=x*(11-i);
            y=y+x;
        }
        return y;

    }
}
