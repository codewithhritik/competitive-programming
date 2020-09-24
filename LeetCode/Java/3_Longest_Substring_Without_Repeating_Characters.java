class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        
        while(b_pointer < s.length()) {
            if(!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                max = Math.max(set.size(), max);
                b_pointer++;
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}