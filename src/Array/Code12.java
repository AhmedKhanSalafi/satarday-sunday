package Array;

public class Code12 {

    public static void main(String[] args) {
//remove sorted duplicate
        int[] arr = {2, 2, 8, 1, 9, 6, 8, 8};
        int [] temp = new int[arr.length];
        int j=0;

        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]){

                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];

        for (int e : temp){

            System.out.println(e);
        }
    }
}
