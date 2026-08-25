class Solution {
    public void sortColors(int[] nums) {
        
    int i=0;
    for(int j=0;j<nums.length;j++){
        if(nums[j]==0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;

            i++;
        }
      }
      for(int j=i;j<nums.length;j++){
        if(nums[j]==1){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;

            i++;
           }
        }
    }
}