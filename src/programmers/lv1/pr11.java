package programmers.lv1;


//함수 solution은 정수 n을 매개변수로 입력받습니다.
//        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//        예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//        제한 조건
//        n은 1이상 8000000000 이하인 자연수입니다.

public class pr11 {
    public long solution(long n) {
        String answer = "";

        String str = Long.toString(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);
        }

        for (int a = 0; a < str.length(); a++)
            for (int b = a; b < str.length(); b++) {
                if (arr[a] > arr[b]) {
                    int tmp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = tmp;
                }
            }
        for (int i = 0; i < str.length(); i++) {
            answer += arr[i];
        }


        return Long.parseLong(answer);
    }
}
