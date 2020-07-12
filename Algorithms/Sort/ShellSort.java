package Sort;

/**
 * @author xrca
 * @date 2020-05-03 22:50
 */
public class ShellSort {
    public static void main(String[] args) {
        // 获取随机数组
        int[] arr = SortUtil.getRandomArray();
        int[] mySortedArr = new int[arr.length];
        // 拷贝数组
        System.arraycopy(arr, 0, mySortedArr, 0, arr.length);
        // 排序
        sort2(mySortedArr);
        // 校验排序是否正确
        System.out.println(SortUtil.checkSort(arr, mySortedArr));
    }

    /**
     * 希尔排序
     * @param array
     */
    public static void sort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = 0; i < gap; i++) {
                int groupSize = array.length / gap;
                // 获取本次间隔数组的最大下标
                int length = i + groupSize * gap >= array.length ? i + (groupSize - 1) * gap : i + groupSize * gap;
                // 此处为间隔长度为gap的插入排序，从间隔数组的第二个数(即下标为gap + i)的数开始插入排序
                for (int j = i + gap; j <= length; j += gap) {
                    // 一直排序到间隔数组的第一个(及k - gap等于第一个数的下表)
                    for (int k = j; k > i; k -= gap) {
                        if (array[k] < array[k - gap]) {
                            SortUtil.swap(array, k, k - gap);
                        }
                    }
                }
            }
            gap /= 2;
        }
    }

    public static void sort2(int[] array) {
        // 希尔排序的gap序列
        int h = 1;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (array[j] < array[j - gap]) {
                        SortUtil.swap(array, j, j - gap);
                    }
                }
            }
        }
    }
}