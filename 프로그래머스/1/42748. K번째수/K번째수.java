import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];  // answer = {0, 0, 0}
        
        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0]; //2
            int j = commands[a][1]; //5
            int k = commands[a][2]; //3
            
            int[] temp = new int[j - i + 1]; // 5 - 2 + 1 = 4 temp = {0,0,0,0}
            int b = 0;
            
        for(int n = i - 1; n < j; n++) { //1 ~ 4 인덱스 순환
            temp[b] = array[n];
            b++;
        } // temp = {5,2,6,3}
            
        Arrays.sort(temp); // {2,3,5,6}
            
        answer[a] = temp[k - 1]; //{5,0,0}
            
        }
        
        return answer;
    }
}