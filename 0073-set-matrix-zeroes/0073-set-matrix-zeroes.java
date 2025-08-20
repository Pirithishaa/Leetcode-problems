class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] row=new int[r];
        int[] col=new int[c];
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}