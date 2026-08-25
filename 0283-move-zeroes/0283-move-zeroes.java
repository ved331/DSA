// class Solution {
//     public void moveZeroes(int[] nums) {
//         int i=0;
//         int j=i;
         
//          while(j<nums.length){
//             if(nums[i]==0 && nums[j]!=0){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//                 j++;
//             }else if(nums[i]!=0){
//                  i++;
//                  j++;
//             }else{
//                 j++;
//             }
//          }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;

        for(int j=0;j<nums.length;j++){
            
            if(nums[j]!=0){
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;

               i++;
            }
        }
    }
}