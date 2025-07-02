class Solution {
    public int solution(String t, String p) {
        int count = 0;
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            //i부터 i+p.length()까지 잘라낸 부분 문자열
            String a = t.substring(i, i + p.length());
            
            if(Long.parseLong(a) <= Long.parseLong(p)){
                count++;
            }
        }
        return count;
    }
    
}