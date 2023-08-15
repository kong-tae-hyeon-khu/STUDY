package programmers.beginner;


//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
//
//        제한사항
//        0 ≤ num1 ≤ 10,000
//        0 ≤ num2 ≤ 10,000
public class pr1 {
    // 매개변수의 범위가 0 ~ 10,000 이므로 정수형으로 받는다.
    // int => 4 byte => 32 bit
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}
