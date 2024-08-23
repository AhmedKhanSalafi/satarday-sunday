package Array;

public class Code9 {

    public static void main(String[] args) {

        // find smallest element in the array

        int[] arr = {4, 2, 8, 1, 9, 6, 3, 7};
        int small = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {

                small = arr[i];
            }
            System.out.println(small);
        }


        }
    }
