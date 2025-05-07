//이게 1단계라고 세상이 억까하는 거 같음
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (num - 1) / w;
        int wcol = w - 1;
        int col = 0;

        if (row % 2 == 0) {
            col = (num - 1) % w;
        } else {
            col = wcol - (num - 1) % w;
        }

        int box = 0;
        int totalRow = (n + wcol) / w;
        
        while(row < totalRow){
            if (row % 2 == 0) {
                box = col + (row * w);
            } else {
                box = (wcol - col) + (row * w);
            }

            if (box < n) {
                answer++;
            }
            
            row++;
        }

        return answer;
    }
}