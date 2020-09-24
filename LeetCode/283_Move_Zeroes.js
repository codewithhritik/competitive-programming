/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    
    let anchor = 0;
    let explorer = 0;
    
    for(let i = explorer; i < nums.length; i++){
        if(nums[i] !== 0){
            let temp = nums[anchor];
            nums[anchor] = nums[i];
            nums[i] = temp;
            
            anchor++;
        }
    }
    
};