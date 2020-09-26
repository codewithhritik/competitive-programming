class Solution {
    public void nextPermutation(int[] nums) {
        // Get the Breakpoint k
        int k = nums.length - 2;
        while(k >= 0 && nums[k] >= nums[k+1]) {
            --k;
        }
        
        // If the array is in decreasing order, Means entire array is the biggest possible permutation, there is no next permutation, return the smallest possible permutation, just REVERSE the array or Sort it, but sorting will be expensive O(n logn), so I reversed
        if(k == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        // Now we got the element k i.e. the breakpoint, now we'll have to find the smallest element from suffix to fix the prefix, so we need go from right to left and find the first element which is bigger that k and swap that element with k
        for(int l = nums.length - 1; l > k; --l) {
            if(nums[l] > nums[k]) {
                // Now Swap, we have got an element greater than k
                int temp = nums[k];
                nums[k] = nums[l];
                nums[l] = temp;
                break;
            }
        }
        
        // Now the prefix is fixed, fix the suffix now by reversing the whole suffix
        reverse(nums, k + 1, nums.length - 1);
    }
    
    private void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}