class Solution {
    public int maxProduct(int[] nums) {
        int l=1;
        int r=1;
        int maxValue=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length){
            l=l*nums[i];
            r=r*nums[nums.length-i-1];
            int maxv=Math.max(l,r);
            maxValue=Math.max(maxValue,maxv);
            i++;
            if(l==0){
                l=1;
            }
            if(r==0){
                r=1;
            }
        }
            return maxValue;
        }
        
    }
