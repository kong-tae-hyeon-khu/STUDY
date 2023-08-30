package programmers.lv1;


//예를 들어, 주어진 수가 6이라면
//        6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어
//        총 8번 만에 1이 됩니다.
//        위 작업을 몇 번이나 반복해야 하는지 반환하는 함수,
//        solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
//
//        제한 사항
//        입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.

public class pr13 {
    public int solution(int num) {
        int answer = 0;

        long newNum = num;

        // 먼저 주어진 수가 1인지 체크.

        if (newNum == 1)
            return 0;

        // 과정 실행. (500번 미만으로.)
        while (answer <= 500) {
            if (newNum == 1)
                return answer;

            answer += 1;
            if (newNum % 2 == 0)
                newNum = newNum / 2;
            else
                newNum = newNum * 3 + 1;

        }


        return -1;
    }
}
