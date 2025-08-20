class Solution {
    public int findCenter(int[][] e) {
        int a=e[0][0];
        int b=e[0][1];
        int c=e[1][0];
        int d=e[1][1];
        if(a==c||a==d){
            return a;
        }
        return b;
    }
}