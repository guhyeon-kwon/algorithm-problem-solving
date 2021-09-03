public class inf_q9 {
    /*
    Sort - compareTo()
     */
    public static void compareToTest() {
        Integer a = 1, b = 3;
        System.out.println(a.compareTo(b));
    }

    public static int solve(String v1, String v2) {
        String[] v1StrArray = v1.split("\\.");
        String[] v2StrArray = v2.split("\\.");

        int length = Math.max(v1StrArray.length, v2StrArray.length);
        for (int i = 0; i < length; i++) {
            Integer v1Int = i < v1StrArray.length ? Integer.parseInt(v1StrArray[i]) : 0;
            Integer v2Int = i < v2StrArray.length ? Integer.parseInt(v2StrArray[i]) : 0;

            int comp = v1Int.compareTo(v2Int);
            if (comp != 0) {
                return comp;
            }
        }

        return 0;
    }


    /*
    String version1 = "8.5.2.4",
           version2 = "8.5.3";
     1. 앞자리를 비교한다
     2. .을 처리한다 => split
     3. 2,3을 비교하면 결정됨
     */
}
