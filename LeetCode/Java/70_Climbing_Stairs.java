// One Approach
// Dynamic Programming Problem
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}


// Recursive Approach, Similar to Fibonacci
class Solution {
    public int climbStairs(int n) {
	int memo[] = new int[n + 1];
        int result = recFun(n, memo);
        return result;
    }
    
    // Recursive Function
    public static int recFun(int n, int memo[]) {
        // Base Case
        if(n <= 1) {
            return 1;
        }
        
        if(memo[n] > 0) {
            return memo[n];
        }
        
        // Recursive call
        int op1 = recFun(n - 1, memo);
        int op2 = recFun(n - 2, memo);
        memo[n] = op1 + op2;
        return op1 + op2;
    }

}
