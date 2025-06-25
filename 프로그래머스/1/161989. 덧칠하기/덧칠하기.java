class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0;
        int a = 0; // 마지막으로 칠할 구역 번호 저장
        
        for(int i = 0 ; i < section.length; i++){
            if(section[i] > a){
                count++;
                a = section[i] + m - 1; // 3 + 4 - 1 = 6
            }
        }
        return count;
    }
}