class Solution {
    public boolean isPalindrome(int x) {
        
        int reversedNumber = 0, remainder;
        int temp = x;
        
        if(x < 0) return false;
        
        while(x > 0) {
            remainder = x % 10;
            x = x / 10;
            reversedNumber = (reversedNumber*10) + remainder;
        }
        
        if(reversedNumber == temp) return true;
        else return false;
    }
}