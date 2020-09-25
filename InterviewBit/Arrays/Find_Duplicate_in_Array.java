public class Solution {
    public int repeatedNumber(final List<Integer> A) {
        
        Set<Integer> set = new LinkedHashSet<>();
        int result = 0;
        
        for(int num: A) {
            if(!set.contains(num)) {
                set.add(num);
            } else {
                result = num;
            }
        }
        return result;
    }
}
