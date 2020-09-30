class Solution {
    public int majorityElement(int[] nums) {
        // Edge Case
        if(nums.length == 1) {
            return nums[0];
        }
        
        int half = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums) {
            // If the element is not in the map add it to the map and set it's count to be 1
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }
            // If the element is already present, increment it's count
            else {
                map.put(num, map.get(num) + 1);
            }
            
            // If the count in the map > half, return count
            if(map.get(num) > half) {
                return num;
            }
        }
        return -1;
    }
}