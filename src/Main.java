import algorithm.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int index = BinarySearch.binarySearch(arr, 4);
        System.out.println("정답 : " + index);

        index = BinarySearch.binarySearch(arr, 10);
        System.out.println("정답 : " + index);
    }
}