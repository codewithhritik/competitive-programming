class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
    
        for(int num: nums) {
            // If the element is already present in it, Pop it
            if(set.contains(num)) {
                set.remove(num);
            } else {
                // If it's not add it to the set
                set.add(num);
            }
        }
        // Returns first element from the set
        return set.iterator().next();
    }
}