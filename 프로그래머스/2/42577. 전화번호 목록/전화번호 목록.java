import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 119 : 1
        HashMap<String, Integer> h1 = new HashMap<>();
        
        //전화번호 다 넣기
        for(String n : phone_book){
            h1.put(n, 1);
        }
        
        //모든 전화번호 다 확인하고
        for(String n : phone_book){
            for(int i = 1; i < n.length(); i++){//접두어 만들기
                String prefix = n.substring(0, i);//0부터i까지 잘라
                if(h1.containsKey(prefix)){//접두어 119,11955... 이 있으니까 false
                    return false;
                }
                    }
            }
        return true;
    }
    
}