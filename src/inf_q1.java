public class inf_q1 {
    /*
    charAt()
     */
    public String solve(String num1, String num2){
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        while(num1Length >= 0 || num2Length >= 0){
            int n1 = 0, n2 = 0;
            if(num1Length >= 0) {
                n1 = num1.charAt(num1Length) - '0';
            }
            if(num2Length >= 0){
                n2 = num2.charAt(num2Length) - '0';
            }
            int sum = n1+n2+carry;
            carry = sum / 10;

            sb.append(sum%10);
            System.out.println(sb);

            num1Length--;
            num2Length--;
        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

}
