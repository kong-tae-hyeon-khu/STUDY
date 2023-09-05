package programmers.lv1;

public class pr23 {
    public String solution(String s) {

        int len = s.length();
        char[] arr = s.toCharArray();


        // 내림차순으로 arr 정렬하기
        for (int a = 0; a < len; a++) {
            for (int b = a; b < len; b++)
                if (arr[a] < arr[b])
                {
                    char tmp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = tmp;

                }
        }


        // 다시 String 으로 정렬 -> toString()
        return String.valueOf(arr);
    }
}
