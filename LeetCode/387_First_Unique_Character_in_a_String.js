/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    
    let frequencies = {};
    
    for(let char of s){
        if(!frequencies[char]){
            frequencies[char] = 1;
        } else{
            frequencies[char]++;
        }
    }
    
    for(let i = 0; i < s.length; i++){
        let char = s.charAt(i);
        
        if(frequencies[char] === 1){
            return i;
        }
    }
    
    return -1;
    
};