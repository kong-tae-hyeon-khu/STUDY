package programmers.lv1;

public class pr12 {
    public boolean solution(int x) {
        boolean answer = true;

        String a = Integer.toString(x); // 문자열로 전환
        int length = a.length(); // 자리수.



        int addAll = 0;
        // 각 자리수의 합 구하기.
        for (int i = 0; i < length; i++) {
            addAll += Integer.parseInt(a.substring(i, i+1));
        }

        if (x % addAll == 0)
            answer = true;
        else
            answer = false;


        return answer;
    }
}
