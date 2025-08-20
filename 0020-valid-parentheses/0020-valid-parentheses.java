class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        int top=-1;
        Character[]arr=new Character[n];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                arr[++top]=c;
            }
            else{
                if((top>=0)&&(c=='}' && arr[top]=='{' ||c==')' && arr[top]=='(' || 
                c==']' && arr[top]=='[' )){
                    top--;
                }
                else{
                    return false;
                }
            }
           
        }
         return top==-1;
    }
}