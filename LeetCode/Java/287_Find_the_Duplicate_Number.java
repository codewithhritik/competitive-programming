class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        int dupVal = 0;
        
        for(int num: nums) {
            if(!set.contains(num)) {
                set.add(num);
            } else {
               dupVal = num;
            }
        }
        return dupVal;
    }
}