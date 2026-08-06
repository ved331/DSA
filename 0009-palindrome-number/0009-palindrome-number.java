class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int reversedNum=0;
          if(x<0){
            return false;
          }
        while(x!=0){
          
            int digit=x%10;
             reversedNum= reversedNum*10+digit;
             x/=10;
        }
       return num==reversedNum;
    }
}