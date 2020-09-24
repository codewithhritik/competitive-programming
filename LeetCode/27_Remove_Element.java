class Solution {
    public int removeElement(int[] nums, int val) {
        
        int valid_elem = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[valid_elem] = nums[i];
                valid_elem++;
            }
        }
        return valid_elem;
    }
}