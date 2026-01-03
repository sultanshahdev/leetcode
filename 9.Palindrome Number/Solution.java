public class Solution {
    public boolean isPalindrome(int x) {

        if(x<0)
            return false;

        int divisor=1;
        while(x / divisor >=10)
        {
            divisor*=10;
        }

        while(x>0)
        {
            int right= x % 10;
            int left= x / divisor;

            if(left!=right)
            {
                return false;
            }
            x = (x % divisor) / 10;

            divisor /= 100;
        }
        
        return true;

        
    }
}