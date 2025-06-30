class Solution {
    public String solution(String s, String skip, int index) {
          StringBuilder answer = new StringBuilder(); 
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i); // 현재 문자
            int count = 0;
            
            while(count < index){
                a++;
                if(a > 'z'){
                    a = 'a';
                }
                
            if(!skip.contains(String.valueOf(a))){
                count++;
            }
            }
            answer.append(a);
        }
        return answer.toString();
    }
}