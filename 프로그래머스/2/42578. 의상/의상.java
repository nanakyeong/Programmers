import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String, Integer> h1 = new HashMap<>();
        
        //전체 옷 넣기 중복되면 + 1
        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            h1.put(type, h1.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        //저장된 모든 값을 순회할 수 있음
        for(int count : h1.values()){
            answer *= (count + 1);
        }
        
        //아무것도 입지 않은 경우
        return answer -1;
    }

}