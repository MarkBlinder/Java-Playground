public class Test {
    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length * 2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i >= arr1.length) {
                arr3[k] = arr2[j];
                j++;
            }
            else if (j >= arr2.length) {
                arr3[k] = arr1[i];
                i++;
            }
            else if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                if (i < arr1.length) {
                    i++;
                }
            }
            else {
                arr3[k] = arr2[j];
                if (j < arr2.length) {
                    j++;
                }
            }
            k++;
        }
        return arr3;
    }
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 13};
        int[] array2 = {8, 9, 11, 16};
        int[] array3;

        array3 = mergeSort(array1, array2);

        for (int i = 0; i < array3.length; i++) {   
            System.out.print(array3[i] + ", ");
        }

        System.out.println();
    }
}