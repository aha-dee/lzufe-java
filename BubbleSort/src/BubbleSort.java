//在 Java 中，数组是一个固定大小的有序元素集合。
// 每个数组都有一个名为 length 的属性
// 它表示数组的长度，即数组中元素的数量。

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
//        arr是自定义变量名，用于表示数组变量；而args是约定俗成的参数名，用于表示从命令行传递给程序的参数
        int n = arr.length;  //表示将数组 arr 的长度赋值给整数变量 n
//        arr.length 表示获取数组 arr 的长度，它返回一个整数值，表示数组中元素的数量。
//        int n = arr.length; 将这个长度值赋给整数变量 n，以便在后续的代码中使用。
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3};
        bubbleSort(arr);

        System.out.println("排序后的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//        第 1 行：定义一个名为 BubbleSort 的公共类。
//        第 2 行：定义了一个名为 bubbleSort 的静态方法，用于执行冒泡排序算法。该方法接收一个整数数组 arr 作为参数。
//        第 3 行：声明一个整数变量 n，并将数组 arr 的长度赋值给它。
//        第 4 行：使用 for 循环进行多轮的排序迭代，外层循环控制轮数。
//        第 5 行：内层循环用于比较相邻元素并进行交换操作，内层循环变量 j 控制每一轮的比较位置。
//        第 6 行：使用条件语句 if 判断当前元素 arr[j] 是否大于后一个元素 arr[j + 1]。
//        第 7-10 行：如果条件成立，进行元素交换操作，将较大的元素放在后面。
//        第 12 行：定义了一个名为 main 的静态方法，作为程序的入口点。
//        第 14 行：创建一个整数数组 arr，并初始化为 {5, 2, 8, 12, 3}。
//        第 15 行：调用 bubbleSort 方法对数组 arr 进行冒泡排序。
//        第 17 行：输出字符串 "排序后的数组:"。
//        第 18-21 行：使用增强型 for 循环遍历数组 arr，将排序后的元素逐个打印出来。
//        第 23 行：程序执行结束

//同一个包可以用 子类可以用
//pakge 包, defoult 缺省