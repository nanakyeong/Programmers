import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> h1 = new HashMap<>();
        
        for(int h2 : nums){
            h1.put(h2, h1.getOrDefault(h2,0) + 1);
        }
        // 4 / 2 = 2
        int length = nums.length / 2;
        
        // 3 >= 2
        if(h1.size() >= length){
            answer = length;
        } else {
            answer = h1.size();
        }
    
          // 2
          return answer;
    }

}