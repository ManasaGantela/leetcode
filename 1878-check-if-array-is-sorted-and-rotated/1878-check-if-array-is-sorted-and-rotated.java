class Solution {
    public boolean check(int[] nums) {
        int deviations=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(i < len-1&& nums[i]>nums[i+1]){
                deviations++;
            }
            else if(i == len-1  && nums[len-1] >nums[0]){
                deviations++;
            }
        }
        return(deviations>1)?false :true;
        
    }
}