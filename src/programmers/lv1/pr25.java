package programmers.lv1;

public class pr25 {
    public boolean solution(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();

        if (len == 4 || len == 6)
        {
            for (int i = 0; i < len; i++) {
                if (!isNum(arr[i]))
                    return false;
            }
            return true;
        }


        return false;
    }

    public boolean isNum(char c) {
        if ('0' <= c && c <= '9')
            return true;
        else
            return false;
    }
}
