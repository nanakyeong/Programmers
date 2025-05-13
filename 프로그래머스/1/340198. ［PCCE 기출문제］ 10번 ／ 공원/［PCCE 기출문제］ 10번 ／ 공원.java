// 이번 문제는 연산식이 부분이 헷갈려서 지피티 도움을 받음..
// 아직 연산식이 복잡해지면 머리 속에서 너무 헷갈려..
// 천천히 하나씩 해 나아가다보면 잘 할 수 있을거라고 믿는다잉!
import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        boolean place = false; // 돗자리 깔 수 있는지

        Arrays.sort(mats);

        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k]; // 가장 큰 돗자리부터 확인
            
            // 돗자리 깔 수 있는 위치 찾기
            for (int i = 0; i <= park.length - size; i++) {
                for (int j = 0; j <= park[0].length - size; j++) {
                    if (placeHere(i, j, size, park)) {
                        place = true;
                        answer = size;
                        break;
                    }
                }
                if (place) break;
            }

            if (place) break;
        }

        return answer;
    }
    
    // 진짜 깔 수 있는지 확인
    public boolean placeHere(int r, int c, int size, String[][] park) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false; // 한 칸이라도 사람이 있으면 못 깔아
                }
            }
        }
        return true;
    }
}