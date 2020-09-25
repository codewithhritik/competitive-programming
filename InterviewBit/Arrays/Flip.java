public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> result = new ArrayList<>();
        int L = 0;
        
        int left = -1;
        int right = -1;
        
        int maxZeros = 0;
        int zeros = 0;
        int ones = 0;
        
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
            
            if(zeros - ones < 0) {
                zeros = ones = 0;
                L = i + 1;
            }
            
            if(zeros - ones > maxZeros) {
                maxZeros = zeros - ones;
                left = L;
                right = i;
            }
        }
        
        if(maxZeros > 0) {
            result.add(left + 1);
            result.add(right + 1);
        }
        
        return result;
    }
}