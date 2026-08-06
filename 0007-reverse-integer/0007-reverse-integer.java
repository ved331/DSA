class Solution {
    public int reverse(int x) {
        int num=x;
        int reversedNum=0;

      

        while(x!=0)
        {
            int digit=x%10;

            if((reversedNum>Integer.MAX_VALUE/10) || (reversedNum<Integer.MIN_VALUE/10)){
                return 0;
            }
             reversedNum=reversedNum *10 + digit;

            x=x/10;
        }
          return reversedNum;
    }
}
