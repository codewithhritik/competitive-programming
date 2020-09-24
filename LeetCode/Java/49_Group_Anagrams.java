class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new LinkedList<String>());
            }
            map.get(sortedString).add(s);
        }
        return new LinkedList<>(map.values());
    }
}