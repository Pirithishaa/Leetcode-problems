class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
         
         if(seen.contains(n)){
            return false;
         }
         seen.add(n);
        int sum=0;
        int num=n;
            while(num!=0){
                int b=num%10;
                sum+=Math.pow(b,2);
                num/=10;
            }
            if(sum==1){
                return true;
            }
            else{
                return isHappy(sum);
            }        

    }
}