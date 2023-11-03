package algorithm.search;

/*
* Binary Search (이진검색)
* 정렬된 리스트에서 특정한 값의 위치를 찾는 알고리즘.
* 처음 중간의 값을 임의로 선택하여, 그 값과 찾고자 하는 값의 크고 작음을 비교하고,
* 만약 중앙갓이 찾는 값보다 크면 그 값은 새로운 최댓값이 되며,
* 작으면 그 값이 새로운 최솟값이 된다.
* */

public class BinarySearch {

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] > value) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (arr[mid] < value) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (arr[mid] == value) {
                return mid;
            }
        }
        throw new RuntimeException("찾을 수 없습니다.");
    }
}
