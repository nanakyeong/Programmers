//난 1단계도 너무 어려워.. 이게 맞는걸까.. 나 실버 아닌가봐... 흑흑
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int cnt = 0;
        
        //희망시각보다 10분 더 주기
        for(int i = 0; i < schedules.length; i++){
            int accept = hour(schedules[i]) + 10;
            boolean success = true;
            
            //지각 검사
            for(int j = 0; j < 7; j++){
                int dayOfWeek = (startday + j - 1) % 7 + 1; //요일 계산 로직
                 if(dayOfWeek == 6 || dayOfWeek == 7) continue; //주말은 뺴고
                
                int time = hour(timelogs[i][j]); //실제 출근 시간
                if(time > accept){
                    success = false;
                    break;
                }
            }
            if(success){
            cnt++;
            }
        }
        
       return cnt;
    }
    
    public int hour(int time){
         int h = time / 100;
        int m = time % 100;
        return h * 60 + m;
    }
}