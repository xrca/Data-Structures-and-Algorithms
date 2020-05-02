# 各类排序算法的复杂度情况

中文名称|英文名称|平均时间复杂度|最坏时间复杂度|最好时间复杂度|空间复杂度|稳定性|
---|:--:|:--:|:--:|:--:|:--:|---:
选择排序|Selection|n^2|n^2|n^2|1|不稳
冒泡排序|Bubble|n^2|n^2|n|1|稳
插入排序|Insertion|n^2|n^2|n|1|稳
堆排序|Heap|n lgn|n lgn|n lgn|1|不稳
希尔排序|Shell|n^1.3|n^2|n|1|不稳
归并排序|Merge|n lgn|nlgn|n lgn|n|稳
快速排序|Quick|n lgn|n^2|n lgn|lgn|不稳
桶排序|Bucket|n + k|n^2|n|n + k|稳
计数排序|Counting|n + k|n + k|n + k|n + k|稳
基数排序|Radix|n * k|n * k|n * k|n + k|稳