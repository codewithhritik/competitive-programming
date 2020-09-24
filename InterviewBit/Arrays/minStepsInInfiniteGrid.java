public class Solution {
    public int minStepsInInfiniteGrid(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // ===========Naive Solution==============
        
        int current_A = A.get(0);
        int current_B = B.get(0);
        
        int count = 0;
        
        for(int i = 1; i < A.size(); i++) {
            int dest_A = A.get(i);
            int dest_B = B.get(i);
            
            while(current_A != dest_A || current_B != dest_B) {
                //Check A
                if(current_A < dest_A) {
                    current_A++;
                }
                else if(current_A > dest_A) {
                    current_A--;
                }
                
                //Check B
                if(current_B < dest_B) {
                    current_B++;
                }
                else if(current_B > dest_B) {
                    current_B--;
                }
                
                count++;
            }
        }
        return count;
        
        
        // ===========Better Solution=================

         int steps = 0;
         for(int i = 1; i < A.size(); i++) {
             steps = steps + Math.max(Math.abs(A.get(i) - A.get(i-1)), Math.abs(B.get(i) - B.get(i-1)));
         }
         return steps;
        
    }
}