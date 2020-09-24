class Solution {
    public int[] sortedSquares(int[] A) {
        int[] squaredArr = new int[A.length];
        
        int left = 0;
        int right = A.length - 1;
        
        for(int i = A.length - 1; i >= 0; i--){
            if(Math.abs(A[left]) > A[right]) {
                squaredArr[i] = A[left] * A[left];
                left++;
            } else {
                squaredArr[i] = A[right] * A[right];
                right--;
            }
        }
        return squaredArr;
    }
}