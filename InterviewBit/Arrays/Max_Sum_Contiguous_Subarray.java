public class Solution {
    public int maxSubArray(final List<Integer> A) {
        
	// This is basically Kadane's Algorithm

        int current_sum = 0;
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < A.size(); i++) {
            current_sum += A.get(i);
            if(current_sum > ans) {
                ans = current_sum;
            }
            if(current_sum <= 0) current_sum = 0;
        }
        return ans;
    }
}
