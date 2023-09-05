package programmers.lv1;

public class pr15 {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 녀석들 개수 찾기.
        int num = 0;
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
            {
                temp[num] = arr[i];
                num += 1;
            }
        }
        System.out.println(num);



        if (num == 0)
        {
            return new int[]{-1};
        }
        // 이제 녀석들을 추가
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = temp[i];
        }

        // 정렬.
        for (int a = 0; a < num; a++) {
            for (int b = a; b < num; b++)
            {
                if (answer[a] > answer[b]) {
                    int tempInt = answer[a];
                    answer[a] = answer[b];
                    answer[b] = tempInt;
                }
            }
        }
        return answer;
    }
}
