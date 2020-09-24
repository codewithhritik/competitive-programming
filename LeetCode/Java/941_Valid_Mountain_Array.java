class Solution {
    public boolean validMountainArray(int[] A) {
        
        if(A.length < 3) return false;
        
        int left = 0;
        int right = A.length - 1;
        
        while(left != right) {
            if(A[left + 1] > A[left]){
                left++;
            } else if(A[right - 1] > A[right]) {
                right--;
            }
            else {
                break;
            }
        }
        return left!=0 && right != A.length - 1 && left == right;
    }
}