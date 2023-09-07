package programmers.lv1;


// 유클리드 호제법 공부하기.
public class pr28 {
    // 최대 공약수
    public int max(int n, int m) {
        int maxvar = n;
        int minvar = m;
        int result = 1;

        if (n <= m) {
            maxvar = m;
            minvar = n;
        }
        for (int i = 2; i <= m; i++) {
            if (n % i == 0 && m % i == 0)
                result = i;

        }

        return result;
    }
    // 최소 공배수. 큰 놈을 조금씩 곱하면 되지 않을까?
    public long min(int n, int m) {
        int minvar = n;
        int maxvar = m;
        int mul = 1;
        if (n >= m) {
            minvar = m;
            maxvar = n;
            long result = n;
            long tmp = result;
            while (result % minvar != 0) {
                mul += 1;
                result = tmp * mul;
            }
            return result;
        } else {
            long result = m;
            long tmp = result;
            while (result % minvar != 0) {
                mul += 1;
                result = tmp * mul;
            }
            return result;
        }

    }

    public long[] solution(int n, int m) {
        long[] answer = new long[2];
        answer[0] = max(n,m);
        answer[1] = min(n,m);


        return answer;

    }
}
