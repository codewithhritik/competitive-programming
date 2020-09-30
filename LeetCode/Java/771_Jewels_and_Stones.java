class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        // Loop over the Jewel String, set removes duplicates, adds unique jewels to the set
        for(char c: J.toCharArray()) {
            set.add(c);
        }
        
        // Check character by character if stones is ptrsent in the string or no
        for(char c: S.toCharArray()) {
            if(set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}