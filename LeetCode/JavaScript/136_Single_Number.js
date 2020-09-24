/**
 * @param {number[]} nums
 * @return {number}
 */

function singleNumber(nums){
    
    //Create a Set
    let set = new Set();
    
    //loop over the array
    for(num of nums){
        
        //if the element is present in the set pop it
        if(set.has(num)){
            set.delete(num);
        } else{
            //Otherwise, Add it to the set
            set.add(num);
        }
    }
    //Return it in the form of an array, Return the first element of the Set
    return Array.from(set)[0];
    
}