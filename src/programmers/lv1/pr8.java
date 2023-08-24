package programmers.lv1;


//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//        제한 조건
//        s의 길이는 1 이상 5이하입니다.
//        s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//        s는 부호와 숫자로만 이루어져있습니다.
//        s는 "0"으로 시작하지 않습니다.
public class pr8 {
    public int solution(String s) {
        int answer = 0;

        int length = s.length(); // 문자열 길이.
        if (s.charAt(0) == '-') {
            for (int i = 1; i < length; i++) {
                answer = answer + (int)((s.charAt(i) - '0') * Math.pow(10, length-i-1));
            }
            answer = answer * (-1);
        }
        else if (s.charAt(0) == '+') {
            for (int i = 1; i < length; i++) {
                answer = answer + (int)((s.charAt(i) - '0') * Math.pow(10, length-i-1));
            }
        }

        else {
            for (int i = 0; i < length; i++) {
                answer = answer + (int)((s.charAt(i) - '0') * Math.pow(10, length-i-1));
            }
        }
        return answer;
    }
}
