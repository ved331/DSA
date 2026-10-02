class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
         String ans="";

         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(sub.length()>ans.length()){
                        ans=sub;
                    }
                }
            }
         }
            return ans;
    }
         public boolean isPalindrome(String s){
            int i=0;
            int j=s.length()-1;

            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
           return true;
    }
}