class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num: nums) {
            String s = String.valueOf(num); //Converted Number to String
            if(s.length() % 2 == 0){ //Check if the letters are even
                count++;
            }
        }
        return count;
    }
}