class Solution {
    public boolean isPalindrome(int x) {
        //base condition
        if(x<0)
        return false;
        //leftmost digit
        int divisor=1;
        while(x/divisor>=10){
            divisor=divisor*10;
        }
        //find left and right most digits
        while(x>0){
            int left=x/divisor;
            int right=x%10;
            //left and right not equal
            if(left!=right)
                return false;
                x=(x%divisor)/10;
                divisor=divisor/100;
            }

        return true;
    }
    }