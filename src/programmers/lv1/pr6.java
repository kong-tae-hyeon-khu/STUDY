package programmers.lv1;

public class pr6 {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            System.out.println(n % 10);
            answer = answer + (n % 10);
            n = n / 10;
        }

        return answer;
    }
}
