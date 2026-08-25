class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currMax=0;
        int currMin=0;

        int minSum=0;
        int maxSum=0;

        for(int i=0;i<nums.length;i++){

            currMin=Math.min(nums[i],currMin+=nums[i]);
            minSum=Math.min(currMin,minSum);

            currMax=Math.max(nums[i],currMax+=nums[i]);
            maxSum=Math.max(maxSum,currMax);

        }
        return Math.max(maxSum,Math.abs(minSum));
    }
}