import java.util.*;
 
class Solution {
    public int solution(int[] citations) {
       
        Integer[] num = new Integer[citations.length];
        
        for(int i = 0; i < citations.length; i++){
            num[i] = citations[i];
        }
        
        //6,5,3,1,0
        Arrays.sort(num, Collections.reverseOrder());
        
        for(int i = 0; i < num.length; i++){
            if(num[i] < i + 1){
                return i;
            }
        }
        
        return citations.length;
        
    }
}