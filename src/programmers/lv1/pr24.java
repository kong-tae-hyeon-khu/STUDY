package programmers.lv1;

public class pr24 {

    public long solution(int price, int money, int count) {
        long answer = (long) money;



        for (int i = 1; i <= count; i++) {
            answer -= ((long) price * i);
        }


        if (answer >= 0)
            return 0;
        else // 금액이 부족한 경우.
            return answer * -1;
    }
}
