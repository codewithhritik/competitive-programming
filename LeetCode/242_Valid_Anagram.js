/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    
    if(s.length !== t.length){
        return false;
    }
    
    let lookup = {};
    
    for(let i = 0; i < s.length; i++){
        let letter = s[i];
        
        if(lookup[letter]){
            lookup[letter] += 1;
        } else{
            lookup[letter] = 1;
        }
    }
    
    for(let i = 0; i < t.length; i++){
        let letter = t[i];
        
        if(!lookup[letter]){
            return false;
        }
        else{
            lookup[letter] -= 1;
        }
    }
    return true;
    
};