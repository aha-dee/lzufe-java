public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3};
        bubbleSort(arr);

        System.out.println("排序后的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
    }
}
