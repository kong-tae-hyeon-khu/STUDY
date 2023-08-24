package programmers.lv1;


//문제 설명
//        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//        예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//        제한 조건
//        n은 10,000,000,000이하인 자연수입니다.
public class pr7 {
    public int[] solution(long n) {
        // 자리수를 일단 알아야하겠지?
        long p = n;
        int 자리수 = 0;

        while (p != 0) {
            자리수 = 자리수 + 1;
            p = p / 10;
        }

        int[] answer = new int[자리수];

        for (int i = 0; i < 자리수; i++) {
            long a = n % 10;
            answer[i] = (int) a;
            n = n / 10;
        }

        return answer;
    }
}
