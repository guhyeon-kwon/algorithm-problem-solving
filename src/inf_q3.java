public class inf_q3 {
    /*
    indexof(), substring()
     */
    public String slove(String[] strs){
        if (strs.length == 0){
            return "";
        }

        String firstStr = strs[0]; // test

        for (int i=1; i<strs.length; i++){ // length : 4
            while(strs[i].indexOf(firstStr) != 0){ // teacher.indexOf(test)
                firstStr = firstStr.substring(0, firstStr.length() -1); // test, tes, te
            }
        }

        return firstStr;
    }
}
