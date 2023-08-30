package programmers.lv1;

public class pr9 {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p = p + 1;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                y = y + 1;
        }

        if (p != y)
            answer = false;



        return answer;
    }
}
