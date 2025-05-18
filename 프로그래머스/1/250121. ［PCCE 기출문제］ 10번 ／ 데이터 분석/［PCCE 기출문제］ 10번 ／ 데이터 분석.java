//해쉬맵 너무 올만에 써봐서 어캐 쓰는지 다 까먹어서 문법 블로그 많이 참고했다..
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
       Map<String, Integer> index = new HashMap<>();
       index.put("code", 0);
         index.put("date", 1);
         index.put("maximum", 2);
         index.put("remain", 3);
        
        List<int[]> filtered = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            if(data[i][index.get(ext)] < val_ext){
                filtered.add(data[i]); //조건에 만족하면 리스트에 넣기
            }
        }
        int sortIndex = index.get(sort_by);
        filtered.sort(Comparator.comparingInt(row -> row[sortIndex])); 
        //row 배열 중 sortIdex번째 값을 꺼내서 정렬
        
        int[][] result = filtered.toArray(new int[0][]);
        //필터링된 리스트 2차원 배열로 저장
        return result;
        }
}