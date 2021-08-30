public class inf_q4 {
    /*
    longest palindrome
     */
    int start, end;

    public String slove(String s){
        int len = s.length();
        if(len < 2) return s;

        for(int i=0; i<len; i++){
            System.out.println("i : " + i);
            findSubstring(s,i,i);
            findSubstring(s,i,i+1);
        }

        return s.substring(start, end+start);
    }

    private void findSubstring(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--; // 0
            right++; // 4
        }
        if (end < right-left-1) {
            start = left + 1;
            end = right + 1;
        }

    }
}
