import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Integer> a = new HashMap<>();
        int[][] giftRecord = new int[friends.length][friends.length];
        int[] month = new int[friends.length];
        int[] giftScore = new int[friends.length];
        
        //배열에 이름 넣기
        for(int i = 0; i < friends.length; i++){
            a.put(friends[i], i);
        }
        
        // 선물 받은 기록
        // 준사람과 받은 사람 찾기
        for(int i = 0; i < gifts.length; i++){
            String[] name = gifts[i].split(" ");
            int giftIndex = a.get(name[0]);
            int receiveIndex = a.get(name[1]);
            giftRecord[giftIndex][receiveIndex]++;
        }
        
        // 선물 계산
        for(int i = 0; i < friends.length; i++){
            int totalA = 0;
            int totalB = 0;
            for(int j = 0; j < friends.length; j++){
                totalA += giftRecord[i][j];
                totalB += giftRecord[j][i];
            }
            
            giftScore[i] = totalA - totalB;
        }
        
        //다음 달 받을 선물 계산
        for(int i = 0; i < friends.length; i++){
            for(int j = i + 1; j < friends.length; j++){
                
                // i가 j에게 준 선물이 더 많을 때
                 if(giftRecord[i][j] > giftRecord[j][i]){
                        month[i]++;
                    } else if(giftRecord[i][j] < giftRecord[j][i]){
                        month[j]++;
                    } else {
                        if(giftScore[i] > giftScore[j]){
                            month[i]++;
                        } else if(giftScore[i] < giftScore[j]){
                            month[j]++;
                        }
                 }
                
                
            }
        }
        
        int max = 0;
        for(int i = 0; i < month.length; i++){
            if(month[i] > max){
                max = month[i];
            }
        }
        
        return max;
        
     
    }
}