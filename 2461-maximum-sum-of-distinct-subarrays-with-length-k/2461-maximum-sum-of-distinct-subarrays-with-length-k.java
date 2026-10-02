class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        
        long maxSum=0;
        long currSum=0;

        int i=0;
        HashSet<Integer> set=new HashSet<>();

        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                currSum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            currSum+=nums[j];

            if(j-i+1>k){
                set.remove(nums[i]);
                currSum-=nums[i];
                i++;                    
                }
                if(j-i+1==k){
                    if(currSum>maxSum){
                        maxSum=currSum;
                    }
            }
        }
        return maxSum;
    }
}