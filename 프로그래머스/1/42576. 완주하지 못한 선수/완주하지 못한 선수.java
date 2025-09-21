import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        

        HashMap<String, Integer> h1 = new HashMap<>();
        
        //key 값에 있으면 value를 가져오고 없으면 0 반환
        //동명이인이면 1 넣어서 값 갱신
        for(String p : participant){
            h1.put(p, h1.getOrDefault(p,0) + 1); 
        }
        
        //완주한 선수는 명단에서 빼기
        for(String c : completion){
            h1.put(c, h1.get(c) - 1);
        }
        
        //완주하지 못했다면 
        String answer= "";
        for(String key : h1.keySet()){
            if(h1.get(key) != 0){
                answer = key;
                break;
            } 
        }
        
        return answer;
    }
}