public class inf_q2 {
    /*
    toCharArray()
     */
    public String slove(String s){
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int openBrace = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                openBrace++;
            } else if(c == ')'){
                if(openBrace == 0) continue;
                openBrace--;
            }
            sb.append(c);
        }

        for(int i = sb.length()-1; i >= 0; i --){
            if (sb.charAt(i) == '(' && openBrace-- > 0) continue;
            result.append(sb.charAt(i));
        }

        return result.reverse().toString();


    }
}
