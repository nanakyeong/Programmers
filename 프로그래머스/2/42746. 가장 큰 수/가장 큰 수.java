import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] num = new String[numbers.length]; //{0,0,0}
        
        for(int i = 0; i < numbers.length; i++){
            num[i] = String.valueOf(numbers[i]); //문자열로 변환
        }
        
        //비교하기
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        
        if(num[0].equals("0")){
            return "0";
        }
        
        //이어 붙이기
        StringBuilder sb = new StringBuilder();
        for(String n : num){
            sb.append(n);
        }
        
       return sb.toString();
        
    }
}