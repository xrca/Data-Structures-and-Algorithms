package Sort;

/**
 * @author xrca
 * @date 2020-05-02 14:54
 */
public class InsertionSort {
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
     * 插入排序
     * @param array
     */
    public static void sort(int[] array) {
        int insertPos;
        for (int i = 1; i < array.length; i++) {
            insertPos = i;
            for (int j = i; j >= 0; j--) {
                // 一直向前比较，找到比自己大的最后一个元素
                if (array[i] < array[j]) {
                    insertPos = j;
                    continue;
                }
            }
            // 若插入的位置不是自己当前的位置，则需要插入目标位置
            if (insertPos != i) {
                SortUtil.insert(array, i, insertPos);
            }
        }
    }

    /**
     * 插入排序
     * @param array
     */
    public static void sort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    SortUtil.swap(array, j, j - 1);
                }
            }
        }
    }
}