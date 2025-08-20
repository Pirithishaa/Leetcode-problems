class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str="";
        int n=strs[0].length();
        int m=strs[strs.length-1].length();
        int i=0;
        while(n!=0 &&m!=0){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                str+=strs[0].charAt(i);
                i++;
                n--;
                m--;
            }
            else{
                break;
            }
        }
        return str;
    }
}