package programmers.lv1;

public class pr22 {
    public boolean this2(int num) {
        int good = 0;

        if (num == 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                good += 1;

        if (good % 2 == 0)
            return true;
        else
            return false;
    }

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (this2(i))
                answer += i;
            else
                answer -= i;
        }

        return answer;
    }
}
