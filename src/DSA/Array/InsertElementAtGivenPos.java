package DSA.Array;

public class InsertElementAtGivenPos {

    public static void main(String[] args) {

        int[] arr = {12, 45, 11, 23, 14, 15, 16, 25, 99, 42, 55, 57};


        printArr(arr);
        int[] newArr1 = insertElement(arr, 10, 25);
        printArr(newArr1);


    }

    public static int[] insertElement(int[] arr, int pos, int value) {

        int len = arr.length;
        int[] newArr = new int[len + 1];
        int temp;

        int i = 0;
        int j = 0;

        do {
            if (i == pos) {
                newArr[i] = value;
                i++;
            }
            newArr[i] = arr[j];
            i++;
            j++;
        } while (i < newArr.length);
        return newArr;
    }

    public static void printArr(int[] arr) {

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

}
