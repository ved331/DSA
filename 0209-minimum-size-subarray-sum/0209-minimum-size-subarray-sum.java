class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int subArrSum=0;
        int minLen=Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++){
           subArrSum+=nums[j];

           while(subArrSum>=target){
               int len=j-i+1;

               if(len<minLen){
                minLen=len;
               }
               subArrSum -= nums[i];
               i++;
           }

        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}