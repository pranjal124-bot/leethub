class Solution {
    public String removeStars(String s) {
        
        Stack<Character> s1 = new Stack<>();


        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }else{
                s1.push(ch);
            }


        }

        StringBuilder sb = new StringBuilder();
        for(char cha : s1){
                sb.append(cha);
        }
        return sb.toString() ;

    }
}