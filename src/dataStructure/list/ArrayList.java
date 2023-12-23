package dataStructure.list;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10; // 최소(기본) 배열 용량.
    private static final Object[] EMPTY_ARRAY = {}; // 빈 배열 (용적 0)

    private int size; // 요소 갖고 있는 개수.
    Object[] array; // 요소를 담을 배열.

    // 생성자1 (초기 공간 할당 X)
    public ArrayList() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }
    // 생성자2 (초기 공간 할당 O)
    public ArrayList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    /**
     * resize -> 동적할당을 위함.
     */
    private void resize() {
        int array_capacity = array.length;

        // If array's capacity is 0
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        // 용량이 꽉 찬 경우.
        if (size == array_capacity) {
            int new_capacity = array_capacity * 2;
            // copy
            array = Arrays.copyOf(array, new_capacity);

            return;
        }
        // 불필요한 공간을 줄여준다.
        if (size < (array_capacity) / 2) {
            int new_capacity = array_capacity / 2;

            // copy
            array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
            return;
        }
    }
    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    public void addLast(E value) {
        // 가득 찬 상태.
        if (size == array.length) {
            resize();
        }
        array[size] = value; // 마지막 위치에 요소 추가.
        size++;
    }
}
