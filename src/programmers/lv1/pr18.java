package programmers.lv1;


//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//        단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
//        예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//        제한 조건
//        arr은 길이 1 이상인 배열입니다.
//        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

public class pr18 {
    public int[] solution(int[] arr) {

        int length = arr.length;
        if (length == 1) {
            return new int[] {-1};
        }

        // Find min number index
        int min_idx = 0;
        for (int i = 1; i < length; i++) {
            if (arr[min_idx] > arr[i])
                min_idx = i;
        }


        // Assign new_arr
        int[] answer = new int[length - 1];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == min_idx)
                continue;
            answer[j] = arr[i];
            j++;

        }
        return answer;
    }
}
