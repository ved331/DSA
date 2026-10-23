class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Integer key:map.keySet()){
        //   if(map.get(key)>n/2){
        //     return key;
        //   }
        // }
        // return -1;

        int major=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(nums[i]==major){
                count++;

            }
            else{
                count--;
            }
        }
        return major;
    }
}