package programmers.lv1;

//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//
//        제한 사항
//        n은 0 이상 3000이하인 정수입니다.
public class pr4 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                answer += i; // 더 효울적인 방법을 생각해보자. => 범위를 절반까지 줄일 수 있음 !
        }

        return answer;
    }

}
