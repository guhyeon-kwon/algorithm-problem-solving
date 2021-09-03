public class Greedy_q1 {
    /*
    i원을 거슬러 주어야 할 때 가장 적은 숫자의 화폐를 이용해 거슬러 주는 경우
    (화폐 단위 : 500, 100, 50, 10
     */

    public static int greedy(int price){
        int count = 0, result = 0;
        result += price / 500;
        price %= 500;

        result += price / 100;
        price %= 100;

        result += price / 50;
        price %= 50;

        result += price / 10;

        return result;

    }
}
