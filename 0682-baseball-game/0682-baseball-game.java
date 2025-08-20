class Solution {
    public int calPoints(String[] o) {
        int n=o.length;
        int[]a=new int [n];
        int top=-1;
        for(int i=0;i<n;i++){
            if(o[i].equals("+")){
                int b=(int)(a[top]+a[top-1]);
                a[++top]=b;
            }
            else if(o[i].equals("D")){
                int b=(int)(a[top]*2);
                a[++top]=b;
            }
            else if(o[i].equals("C")){
                top--;
            }
            else{
                a[++top]=Integer.parseInt(o[i]);
            }
        }
        int sum=0;
        for(int i=0;i<=top;i++){
            sum+=(int)a[i];
        }
        return sum;
    }
}