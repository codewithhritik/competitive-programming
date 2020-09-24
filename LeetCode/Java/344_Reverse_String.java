class Solution {
    public void reverseString(char[] s) {
        
//         i →               ← j
//         h    e    l    l    o                   

//         exchange i with j in each iteration.
        
        int i = 0, j = s.length - 1;
        while (i < j) {
            char t = s[i];
            s[i++] = s[j];
            s[j--] = t;
        }
    }
}