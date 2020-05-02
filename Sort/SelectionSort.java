package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        // 获取随机数组
        int[] arr = SortUtil.getRandomArray();
        int[] mySortedArr = new int[arr.length];
        // 拷贝数组
        System.arraycopy(arr, 0, mySortedArr, 0, arr.length);
        // 排序
        sort(mySortedArr);
        // 校验排序是否正确
        System.out.println(SortUtil.checkSort(arr, mySortedArr));
    }

    /**
     * 选择排序
     * @param array
     */
    public static void sort(int[] array) {
        int minPos = 0;
        for (int i = 0; i < array.length - 1; i++) {
            minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            SortUtil.swap(array, i, minPos); 
        }
    }
}